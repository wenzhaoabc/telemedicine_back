package cn.tongji.hospital.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_article")
public class Article {
    @TableId(value = "article_id")
    private String articleId;
    private String actorId;
    private String title;
    private String content;
    private String createTime;
    private Integer upNum;
    private Integer downNum;
    private Integer reviewNum;
}
