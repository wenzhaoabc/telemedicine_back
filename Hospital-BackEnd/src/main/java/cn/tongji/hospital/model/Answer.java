package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zst
 * @since 2022/12/9
 */
@Data
@TableName(value = "t_answer")
public class Answer {
    @TableId(value = "a_id")
    private String aId;
    private String qId;
    private Long actorId;
    private String content;
    private String createTime;
    private Integer upNum;
    private Integer downNum;
    private Integer reviewNum;
}
