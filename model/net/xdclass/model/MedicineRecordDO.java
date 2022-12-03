package net.xdclass.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("medicine_record")
public class MedicineRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long recordId;

    private Integer quantity;

    private Long medicineId;


}
