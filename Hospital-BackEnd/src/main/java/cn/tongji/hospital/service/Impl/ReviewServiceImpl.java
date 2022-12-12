package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.mapper.ReviewMapper;
import cn.tongji.hospital.model.Article;
import cn.tongji.hospital.model.Review;
import cn.tongji.hospital.model.temp.ReviewWithActor;
import cn.tongji.hospital.service.ReviewService;
import cn.tongji.hospital.util.UniqueIdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public String getReviewList(String id, String type) {
        Map<String, Object> resList = new HashMap<>();
        if (Objects.equals(type, "article") || Objects.equals(type, "answer")) {
            List<Review> reviewList = reviewMapper.selectList(
                    new QueryWrapper<Review>()
                            .eq("father", id)
                            .eq("father_type", type)
            );

            return new Gson().toJson(reviewList);
        }
        return null;
    }

    @Override
    public String postReview(Review review) {
        if (Objects.equals(review.getContent(), "")) {
            return null;
        }
        review.setReviewId(UniqueIdUtil.getID());
        review.setLikeNum(0);
        review.setStarNum(0);
        reviewMapper.insert(review);
        return new Gson().toJson(review);
    }

    @Override
    public String getReviewListWithActor(String father, String fatherType) {
        List<ReviewWithActor> reviewWithActorList =
                reviewMapper.getReviewListWithActor(fatherType, father);
        List<Map> resList = new ArrayList<>();
        for (ReviewWithActor item : reviewWithActorList) {
            Map<String, Object> resItem = new HashMap<>();
            Map<String, Object> actorItem = new HashMap<>();
            actorItem.put("actorId", item.getActorId());
            actorItem.put("name", item.getName());
            actorItem.put("avatar", item.getAvatar());
            resItem.put("actor", actorItem);
            Map<String, Object> reviewItem = new HashMap<>();
            reviewItem.put("reviewId", item.getReviewId());
            reviewItem.put("content", item.getContent());
            reviewItem.put("createTime", item.getCreateTime());
            reviewItem.put("likeNum", item.getLikeNum());
            reviewItem.put("starNum", item.getStarNum());
            resItem.put("review", reviewItem);
            resList.add(resItem);
        }
        return new Gson().toJson(resList);
    }
}
