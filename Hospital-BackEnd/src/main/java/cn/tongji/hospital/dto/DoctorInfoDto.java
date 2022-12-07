package cn.tongji.hospital.dto;

import lombok.Data;

/**
 * @Author : 王晨
 * @Date : Created in 14:09 2022/12/4
 */
@Data
public class DoctorInfoDto {
    Long actorId;
    String name;
    String telephone;
    Integer age;
    Integer gender;
    String department;
    Integer seviceYear;
    String hospital;
    String introduction;
    String field;
    Integer score;
    String photo;
}
