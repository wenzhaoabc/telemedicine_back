package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class User {
    @TableId(value = "user_id")
    String userId;
    String phone;
    String password;
    String name;
    Integer age;
    String avatar;
    String selfDesc;
    String gender;
}
