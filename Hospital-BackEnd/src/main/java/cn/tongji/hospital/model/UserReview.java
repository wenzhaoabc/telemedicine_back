package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_review")
public class UserReview {
    @TableField("actor_id")
    private Long actorId;
    @TableField("review_id")
    private String reviewId;
    private Boolean like;
    private Boolean star;
    private Boolean review;
}
