package cn.tongji.hospital.model;

import java.util.Date;
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
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long recordId;

    private Date createTime;

    private String value;

    private Integer kind;

    private Long senderId;

    private Long receiverId;


}
