package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zst
 * @since 2022/12/9
 */
@Data
@TableName(value = "t_question")
public class Question {
    @TableId(value = "q_id")
    private String qId;
    private Long actorId;
    private String title;
    private String content;
    private String createTime;
    private Integer ansCount;
}
