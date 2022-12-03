package net.xdclass.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@TableName("actor")
public class ActorDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "actor_id", type = IdType.AUTO)
    private Long actorId;

    private String password;

    private String name;

    private Integer role;

    private String telephone;

    private Integer age;

    private Integer gender;

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
