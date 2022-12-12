package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_answer")
public class UserAnswer {
    @TableField("actor_id")
    private Long actorId;
    @TableField("a_id")
    private String answerId;
    private Boolean up;
    private Boolean down;
    private Boolean review;
}
