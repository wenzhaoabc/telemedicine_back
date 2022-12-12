package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.dto.ImageUploadDto;
import cn.tongji.hospital.dto.UserInfoDto;
import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.mapper.AnswerMapper;
import cn.tongji.hospital.mapper.QuestionMapper;
import cn.tongji.hospital.mapper.UserAnswerMapper;
import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.model.Answer;
import cn.tongji.hospital.model.Question;
import cn.tongji.hospital.model.UserAnswer;
import cn.tongji.hospital.service.ForumQAService;
import cn.tongji.hospital.service.OssService;
import cn.tongji.hospital.util.ImageUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ForumQAServiceImpl implements ForumQAService {
    @Autowired
    private ActorMapper actorMapper;

    @Autowired
    private QuestionMapper question;
    @Autowired
    private AnswerMapper answer;

    @Autowired
    private UserAnswerMapper userAnswerMapper;

    @Autowired
    private OssService ossService;

    @Override
    public String getTopicList(Integer pageSize, Integer offset, Long userId) {

        List<Map> resList = new ArrayList<>();

        Page<Question> questionIPage = question.selectPage(new Page<Question>(offset, pageSize),
                new QueryWrapper<Question>()
                        .select("q_id", "title")
                        .ge("ans_count", 1));
        List<Question> questionList = questionIPage.getRecords();
        System.out.println("offset = " + offset + " pageSize = " + pageSize);
        System.out.println(questionList);
        for (Question q : questionList) {
            Map<String, Object> item = new HashMap<>();
            Map<String, Object> ques = new HashMap<>();
            ques.put("qId", q.getQId());
            ques.put("title", q.getTitle());
            item.put("question", ques);
            // 查询回答
            Answer ans = answer.selectOne(new QueryWrapper<Answer>()
                    .eq("q_id", q.getQId())
                    .last("limit 1"));
            item.put("answer", ans);
            // 查询用户对回答的点赞，踩情况
            Map<String, Object> userAction = new HashMap<>();
            if (userId != null && ans != null) {
                UserAnswer userAnswer = userAnswerMapper.selectOne(new QueryWrapper<UserAnswer>()
                        .eq("actor_id", userId)
                        .eq("a_id", ans.getAId()));
                if (userAnswer != null) {
                    userAction.put("up", userAnswer.getUp());
                    userAction.put("down", userAnswer.getDown());
                }
            } else {
                userAction.put("up", false);
                userAction.put("down", false);
            }
            item.put("action", userAction);
            // 查询作者
//            Actor author = actorMapper.selectById(ans.getActorId());
            Actor author = actorMapper.selectOne(new QueryWrapper<Actor>()
                    .select("actor_id", "name", "photo", "self_desc")
                    .eq("actor_id", ans.getActorId())
                    .last("limit 1"));
            Map<String, Object> actorItem = new HashMap<>();
            actorItem.put("actorId", author.getActorId());
            actorItem.put("name", author.getName());
            actorItem.put("avatar", author.getPhoto());
            actorItem.put("selfDesc", author.getSelfDesc());
            // 装配
            item.put("actor", actorItem);
            resList.add(item);
        }
        return new Gson().toJson(resList);
    }

    @Override
    public String getUserBriefInfo(Long userId) {
        Actor actor = actorMapper.selectOne(new QueryWrapper<Actor>()
                .select("actor_id", "name", "photo", "gender", "self_desc")
                .eq("actor_id", userId)
                .last("limit 1"));
        UserInfoDto userInfo = new UserInfoDto();
        userInfo.setActorId(actor.getActorId());
        userInfo.setName(actor.getName());
        userInfo.setAvatar(actor.getPhoto());
        userInfo.setSelfDesc(actor.getSelfDesc());
        userInfo.setGender(actor.getGender());
        return new Gson().toJson(userInfo);
    }

    @Override
    public String postImage(ImageUploadDto file) {
        System.out.println(file.toString());
        MultipartFile multipartFile = ImageUtils.base64ToMultipartFile(file.getFile());
        String location = ossService.uploadFile(multipartFile);
        Map<String, Object> res = new HashMap<>();
        res.put("location", location);
        return new Gson().toJson(res);
    }
}
