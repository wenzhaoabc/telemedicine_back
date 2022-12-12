package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.dto.UserInfoDto;
import cn.tongji.hospital.mapper.QuestionMapper;
import cn.tongji.hospital.model.Answer;
import cn.tongji.hospital.model.Question;
import cn.tongji.hospital.service.ForumQAService;
import cn.tongji.hospital.service.QuestionService;
import cn.tongji.hospital.util.UniqueIdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private ForumQAService forumQAService;


    @Override
    public String getQuestion(String qId) {
        Question res = questionMapper.selectById(qId);

        return new Gson().toJson(res);
    }

    @Override
    public String postQuestion(Question ques) {
        if (ques.getTitle() == null || Objects.equals(ques.getTitle(), "")
                || ques.getContent() == null || Objects.equals(ques.getContent(), "")) {
            return null;
        }
        ques.setQId(UniqueIdUtil.getID());
        questionMapper.insert(ques);
        return ques.getQId();
    }

    @Override
    public String getQuestionsByUser(long actorId) {
        List<Question> resList = new ArrayList<>();
        List<Question> questionList = questionMapper.selectList(new QueryWrapper<Question>().eq("actor_id", actorId));
        return new Gson().toJson(questionList);
    }

    @Override
    public String getQuestionList(Long userId, String hot) {
        List<Question> questionList;
        if (userId == 0 && Objects.equals(hot, "null")) {
            questionList = questionMapper.selectList(new QueryWrapper<Question>()
                    .last("limit 10"));
        } else if (userId != 0) {
            questionList = questionMapper.getLovedQuestions(userId);
        } else {
            questionList = questionMapper.selectList(new QueryWrapper<Question>()
                    .orderByAsc("q_id")
                    .last("limit 10"));
        }
        List<Map> resList = new ArrayList<>();
        for (Question question : questionList) {
            Map<String, Object> item = new HashMap<>();
            UserInfoDto userInfoDto = new Gson().fromJson(forumQAService.getUserBriefInfo(question.getActorId()), UserInfoDto.class);
            item.put("question", question);
            item.put("actor", userInfoDto);
            resList.add(item);
        }
        return new Gson().toJson(resList);
    }
}
