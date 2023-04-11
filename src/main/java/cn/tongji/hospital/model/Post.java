package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "post_id", type = IdType.AUTO)
    private Long postId;

    /**
     * 发帖人id
     */
    private Long actorId;

    private String text;

    private String title;

    private Date createTime;


}
