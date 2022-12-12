package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.mapper.*;
import cn.tongji.hospital.model.*;
import cn.tongji.hospital.service.UserActionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActionServiceImpl implements UserActionService {
    @Autowired
    private UserAnswerMapper userAnswerMapper;
    @Autowired
    private AnswerMapper answerMapper;
    @Autowired
    private UserArticleMapper userArticleMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UserReviewMapper userReviewMapper;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private UserLikeMapper userLikeMapper;

    @Override
    public Boolean toArticle(UserArticle userArticle) {
        UserArticle existed = userArticleMapper.selectOne(new QueryWrapper<UserArticle>()
                .eq("actor_id", userArticle.getActorId())
                .eq("article", userArticle.getArticleId()));
        if (existed != null) {
            if (!(userArticle.getUp() && userArticle.getDown())) {
                Article article = articleMapper.selectById(userArticle.getArticleId());
                Integer uptemp = userArticle.getUp().compareTo(existed.getUp());
                Integer downitem = userArticle.getDown().compareTo(existed.getDown());
                article.setUpNum(article.getUpNum() + uptemp);
                article.setDownNum(article.getDownNum() + downitem);
                if (!userArticle.getUp() && !userArticle.getDown()) {
                    userArticleMapper.delete(new QueryWrapper<UserArticle>()
                            .eq("actor_id", userArticle.getActorId())
                            .eq("article", userArticle.getArticleId()));
                } else {
                    userArticleMapper.update(userArticle, new QueryWrapper<UserArticle>()
                            .eq("actor_id", userArticle.getArticleId())
                            .eq("article", userArticle.getArticleId()));
                }
                return true;
            }
            return false;
        }
        userArticleMapper.insert(userArticle);
        return true;
    }

    @Override
    public Boolean toAnswer(UserAnswer userAnswer) {
        UserAnswer existed = userAnswerMapper.selectOne(new QueryWrapper<UserAnswer>()
                .eq("actor_id", userAnswer.getActorId())
                .eq("a_id", userAnswer.getAnswerId()));
        if (existed != null) {
            if (!(userAnswer.getUp() && userAnswer.getDown())) {
                Answer answer = answerMapper.selectById(userAnswer.getAnswerId());
                Integer uptemp = userAnswer.getUp().compareTo(existed.getUp());
                Integer downitem = userAnswer.getDown().compareTo(existed.getDown());
                answer.setUpNum(answer.getUpNum() + uptemp);
                answer.setDownNum(answer.getDownNum() + downitem);
                if (!userAnswer.getUp() && !userAnswer.getDown()) {
                    userAnswerMapper.delete(new QueryWrapper<UserAnswer>()
                            .eq("actor_id", userAnswer.getAnswerId())
                            .eq("a_id", userAnswer.getAnswerId()));
                    return true;
                }
                userAnswerMapper.update(userAnswer, new QueryWrapper<UserAnswer>()
                        .eq("actor_id", userAnswer.getAnswerId())
                        .eq("a_id", userAnswer.getAnswerId()));
                return true;
            }
            return false;
        }
        userAnswerMapper.insert(userAnswer);
        return true;
    }

    @Override
    public Boolean toReview(UserReview userReview) {
        UserReview existed = userReviewMapper.selectOne(new QueryWrapper<UserReview>()
                .eq("actor_id", userReview.getActorId())
                .eq("review_id", userReview.getReviewId()));
        if (existed != null) {
            Review review = reviewMapper.selectById(userReview.getReview());
            Integer likeitem = userReview.getLike().compareTo(existed.getLike());
            Integer staritem = userReview.getStar().compareTo(existed.getStar());
            review.setLikeNum(review.getLikeNum() + likeitem);
            review.setStarNum(review.getStarNum() + staritem);
            if (!userReview.getStar() && !userReview.getLike()) {
                userReviewMapper.delete(new QueryWrapper<UserReview>()
                        .eq("actor_id", userReview.getActorId())
                        .eq("review_id", userReview.getReview()));
                return true;
            }
            userReviewMapper.update(userReview, new QueryWrapper<UserReview>()
                    .eq("actor_id", userReview.getActorId())
                    .eq("review_id", userReview.getReview()));
            return true;
        }
        userReviewMapper.insert(userReview);
        return true;
    }


    // 关注
    @Override
    public Boolean toUserLiked(UserLike userLike) {
        UserLike existed = userLikeMapper.selectOne(new QueryWrapper<UserLike>()
                .eq("fan", userLike.getFan())
                .eq("liked", userLike.getLiked())
                .last("limit 1"));
        if (existed != null) {
            return false;
        } else {
            userLikeMapper.insert(userLike);
        }
        return true;
    }

    // 取消关注
    @Override
    public Boolean toCancelLiked(UserLike userLike) {
        UserLike existed = userLikeMapper.selectOne(new QueryWrapper<UserLike>()
                .eq("fan", userLike.getFan())
                .eq("liked", userLike.getLiked())
                .last("limit 1"));
        if (existed != null) {
            userLikeMapper.delete(new QueryWrapper<UserLike>()
                    .eq("fan", userLike.getFan())
                    .eq("liked", userLike.getLiked()));
            return true;
        } else {
            return false;
        }
    }
}
