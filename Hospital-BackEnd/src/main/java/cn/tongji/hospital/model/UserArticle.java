package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_article")
public class UserArticle {
    @TableField("actor_id")
    private Long actorId;
    @TableField("article")
    private String articleId;
    private Boolean up;
    private Boolean down;
    private Boolean review;
}
