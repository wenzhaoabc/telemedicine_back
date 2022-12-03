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
@TableName("post_picture")
public class PostPictureDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long postId;

    private String picturePath;


}
