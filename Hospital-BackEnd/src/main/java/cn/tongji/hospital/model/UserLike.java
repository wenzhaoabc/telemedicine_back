package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_like")
public class UserLike {
    private Long fan;
    private Long liked;
    @TableField("create_time")
    private String changeTime;
}
