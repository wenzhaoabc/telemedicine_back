package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.IdType;
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

    public Actor(String name, String pwd, String gender, Integer age, String phone) {
        this.actorId = YitIdHelper.nextId();
        this.name = name;
        this.password = pwd;
        if (gender.equals("男"))
            this.gender = "m";
        else
            this.gender = "f";
        this.telephone = phone;
        this.age = age;
        /*默认头像和身份*/
        this.photo = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.huabanimg.com%2F07b029c67010c0a17a1c78fcbc92ce612de4cf3ae8dd-Oc4KXC_fw658&refer=http%3A%2F%2Fhbimg.huabanimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1672485726&t=80d1cd40a19072dff96fdb757c9efb76";
        this.role = "patient";
    }


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

}
