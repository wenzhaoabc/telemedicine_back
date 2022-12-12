package cn.tongji.hospital.service;

import cn.tongji.hospital.model.Question;

/**
 * @author zst
 * @since 2022-12-11
 */
public interface QuestionService {
    // 获取问题详情
    String getQuestion(String qId);

    // 提问
    String postQuestion(Question ques);

    // 获得某一用户的所有提问
    String getQuestionsByUser(long actorId);

    // 获得问题列表
    String getQuestionList(Long userId, String hot);

}
