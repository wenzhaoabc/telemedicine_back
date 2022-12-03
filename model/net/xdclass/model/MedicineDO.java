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
@TableName("medicine")
public class MedicineDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "medicine_id", type = IdType.AUTO)
    private Long medicineId;

    private String name;

    private Integer price;

    /**
     * 库存
     */
    private Integer inventory;

    private Integer indication;

    private Integer brand;


}
