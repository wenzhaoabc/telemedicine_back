package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.mapper.QuestionMapper;
import cn.tongji.hospital.model.Question;
import cn.tongji.hospital.service.QuestionService;
import cn.tongji.hospital.util.UniqueIdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

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
        ques.setCreateTime(new Date().toString());
        questionMapper.insert(ques);
        return "{'qid':" + ques.getQId() + "}";
    }

    @Override
    public String getQuestionsByUser(long actorId) {
        List<Question> resList = new ArrayList<>();
        List<Question> questionList = questionMapper.selectList(new QueryWrapper<Question>().eq("actor_id", actorId));
        return new Gson().toJson(questionList);
    }
}
