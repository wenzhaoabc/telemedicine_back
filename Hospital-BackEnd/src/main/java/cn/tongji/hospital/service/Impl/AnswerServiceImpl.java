package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.dto.UserInfoDto;
import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.mapper.AnswerMapper;
import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.model.Answer;
import cn.tongji.hospital.service.AnswerService;
import cn.tongji.hospital.service.ForumQAService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerMapper answerMapper;
    @Autowired
    private ForumQAService forumQAService;

    @Override
    public String getAnswerList(String qId) {
        List<Map> resList = new ArrayList<>();
        List<Answer> answerList = answerMapper.selectList(new QueryWrapper<Answer>()
                .eq("q_id", qId));
        for (Answer answer : answerList) {
            Map<String, Object> item = new HashMap<>();
            UserInfoDto userInfoDto = new Gson().fromJson(forumQAService.getUserBriefInfo(answer.getActorId()), UserInfoDto.class);
            item.put("answer", answer);
            item.put("actor", userInfoDto);
            resList.add(item);
        }
        return new Gson().toJson(resList);
    }
}
