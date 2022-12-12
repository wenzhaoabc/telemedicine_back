package cn.tongji.hospital.dto;

import lombok.Data;

@Data
public class RegisterActorDto {
    String phone;
    String name;
    String pwd;
    Integer age;
    String gender;

}