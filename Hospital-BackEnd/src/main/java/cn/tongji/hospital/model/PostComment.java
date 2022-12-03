package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 一级评论
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PostComment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "comment_id", type = IdType.AUTO)
    private Long commentId;

    /**
     * 评论的评论的id
     */
    private Long fatherId;

    /**
     * 评论的文本内容
     */
    private String text;

    private Long actorId;

    /**
     * 评论的时间
     */
    private Date createTime;

    /**
     * 评论的帖子的id
     */
    private Integer rootId;


}
