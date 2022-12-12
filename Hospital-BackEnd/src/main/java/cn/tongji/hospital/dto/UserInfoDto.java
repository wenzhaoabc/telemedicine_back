package cn.tongji.hospital.dto;

import lombok.Data;

@Data
public class UserInfoDto {
    private Long actorId;
    private String name;
    private String avatar;
    private String gender;
    private String selfDesc;
}
