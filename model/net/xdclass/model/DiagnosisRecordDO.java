package net.xdclass.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 整个诊疗记录，包括付款、聊天、评价
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("diagnosis_record")
public class DiagnosisRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "record_id", type = IdType.AUTO)
    private Long recordId;

    private Long patientId;

    private Long doctorId;

    private String state;

    /**
     * 患者评论
     */
    private String review;

    /**
     * 医生建议
     */
    private Integer advice;

    /**
     * 患者给医生打分
     */
    private Integer reviewScore;

    /**
     * 药品费用
     */
    private Integer price;

    /**
     * 患者下订单的时间
     */
    private Date startTime;

    /**
     * 支付时间
     */
    private Date payTime;

    private Date endTime;

    /**
     * 患者问题描述
     */
    private String problem;


}
