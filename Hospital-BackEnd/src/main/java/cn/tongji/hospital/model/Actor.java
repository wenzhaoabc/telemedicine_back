package cn.tongji.hospital.model;

<<<<<<< Updated upstream:Hospital-BackEnd/src/main/java/cn/tongji/hospital/model/Actor.java
import java.io.Serializable;

public class Actor implements Serializable {
    private Long actorId;

    private String password;

    private String name;

    private String role;

    private Integer telephone;

    private Integer age;

    private String gender;

    private String department;

    private Integer seviceYear;

    private String hospital;

    private Integer introduction;

    private String field;

    private Integer score;

    private String photo;

    private Integer price;

    private static final long serialVersionUID = 1L;

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
=======
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.github.yitter.idgen.YitIdHelper;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Actor implements Serializable {
    public static final int patient=0;
    public static final int doctor=1;
    public static final int female=0;
    public static final int male=1;

    private static final long serialVersionUID = 1L;
    public Actor(String name, String pwd, String gender, Integer age, String phone){
        this.actorId= YitIdHelper.nextId();
        this.name=name;
        this.password=pwd;
        if(gender.equals("男"))
            this.gender=male;
        else
            this.gender=female;
        this.telephone=phone;
        this.age=age;
        /*默认头像和身份*/
        this.photo="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhbimg.huabanimg.com%2F07b029c67010c0a17a1c78fcbc92ce612de4cf3ae8dd-Oc4KXC_fw658&refer=http%3A%2F%2Fhbimg.huabanimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1672485726&t=80d1cd40a19072dff96fdb757c9efb76";
        this.role=patient;
    }

      @TableId(value = "actor_id", type = IdType.AUTO)
    private Long actorId;

    private String password;
>>>>>>> Stashed changes:Hospital-Backend/src/main/java/cn/tongji/hospital/model/Actor.java

    private String name;

    private Integer role;

    private String telephone;

    private Integer age;

<<<<<<< Updated upstream:Hospital-BackEnd/src/main/java/cn/tongji/hospital/model/Actor.java
    public Integer getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Integer introduction) {
        this.introduction = introduction;
    }
=======
    private Integer gender;

    private String department;
>>>>>>> Stashed changes:Hospital-Backend/src/main/java/cn/tongji/hospital/model/Actor.java

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
