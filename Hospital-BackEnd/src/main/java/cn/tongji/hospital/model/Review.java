package cn.tongji.hospital.model;

import cn.tongji.hospital.model.temp.ReviewWithActor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_review")
public class Review {
    @TableId(value = "review_id")
    private String reviewId;
    private Long actorId;
    private String father;
    private String fatherType;
    private String content;
    private String createTime;
    private Integer likeNum;
    private Integer starNum;

}
