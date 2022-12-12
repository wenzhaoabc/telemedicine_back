package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.mapper.ReviewMapper;
import cn.tongji.hospital.model.Article;
import cn.tongji.hospital.model.Review;
import cn.tongji.hospital.service.ReviewService;
import cn.tongji.hospital.util.UniqueIdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public String getReviewList(String id, String type) {
        if (Objects.equals(type, "article") || Objects.equals(type, "answer")) {
            List<Review> resList = reviewMapper.selectList(
                    new QueryWrapper<Review>()
                            .eq("father", id)
                            .eq("father_type", type)
            );
            return new Gson().toJson(resList);
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
}
