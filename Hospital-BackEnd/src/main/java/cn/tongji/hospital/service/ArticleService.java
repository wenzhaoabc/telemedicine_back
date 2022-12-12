package cn.tongji.hospital.service;

import cn.tongji.hospital.model.Article;

public interface ArticleService {
    // 分页获取文章简讯
    String getArticleList(Integer offset, Integer pageSize, Long userId);

    // 获取文章详情
    String getArticleDetail(String articleId);

    // 上传文章
    String postArticle(Article article);
}
