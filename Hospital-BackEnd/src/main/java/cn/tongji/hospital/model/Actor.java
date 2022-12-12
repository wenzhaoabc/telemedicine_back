package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import com.github.yitter.idgen.YitIdHelper;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wc
 * @since 2022-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Actor implements Serializable {

    @TableId(value = "actor_id")
    private Long actorId;

    private String password;

    private String name;

    private String role;

    private String telephone;

    private Integer age;

    private String gender;

    private String department;


    /**
     * 医龄
     */
    private Integer seviceYear;

    /**
     * 所属医院
     */
    private String hospital;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 擅长
     */
    private String field;

    /**
     * 平均评价分
     */
    private Integer score;

    /**
     * 头像路径
     */
    private String photo;

    /**
     * 医生的咨询费
     */
    private Integer price;

    @TableField("self_desc")
    private String selfDesc;

}
