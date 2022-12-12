package cn.tongji.hospital.model.temp;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class ReviewWithActor {
    private Long actorId;
    private String name;
    private String avatar;
    private String reviewId;
    private String father;
    private String fatherType;
    private String content;
    private String createTime;
    private Integer likeNum;
    private Integer starNum;
}
