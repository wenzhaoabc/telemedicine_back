package cn.tongji.hospital.service;

import cn.tongji.hospital.mapper.ReviewMapper;
import cn.tongji.hospital.model.Review;

public interface ReviewService {
    /**
     * @param id   文章或回答的id
     * @param type 父级元素类型 article/answer
     * @return 评论列表
     */
    String getReviewList(String id, String type);

    /**
     * @param review 用户评论
     * @return 评论ID
     */
    String postReview(Review review);
}
