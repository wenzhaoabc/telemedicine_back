package cn.tongji.hospital.service;

import cn.tongji.hospital.model.*;

/**
 * 用户对于评论/回答/文章的赞踩
 */
public interface UserActionService {
    Boolean toArticle(UserArticle userArticle);

    Boolean toAnswer(UserAnswer userAnswer);

    Boolean toReview(UserReview userReview);

    // 关注用户
    Boolean toUserLiked(UserLike userLike);

    // 取消对某用户的关注
    Boolean toCancelLiked(UserLike userLike);
}
