package cn.tongji.hospital.service.Impl;

import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.mapper.ArticleMapper;
import cn.tongji.hospital.mapper.UserArticleMapper;
import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.model.Article;
import cn.tongji.hospital.model.UserArticle;
import cn.tongji.hospital.service.ArticleService;
import cn.tongji.hospital.util.UniqueIdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ActorMapper actorMapper;

    @Autowired
    private UserArticleMapper userArticleMapper;

    @Override
    public String getArticleList(Integer offset, Integer pageSize, Long userId) {
        List<Map> resList = new ArrayList<>();
        Page<Article> articleIpage = articleMapper.selectPage(
                new Page<Article>(offset, pageSize),
                new QueryWrapper<Article>().select(
                        "article_id", "actor_id", "title", "content", "create_time", "up_num", "down_num", "review_num"));
        List<Article> articleList = articleIpage.getRecords();
        for (Article article : articleList) {
            Map<String, Object> item = new HashMap<>();
            Map<String, Object> articleItem = new HashMap<>();
            articleItem.put("articleId", article.getArticleId());
            articleItem.put("actorId", article.getActorId());
            articleItem.put("title", article.getTitle());
            articleItem.put("content", article.getContent().substring(0, 200));
            articleItem.put("createTime", article.getCreateTime());
            articleItem.put("upNum", article.getUpNum());
            articleItem.put("downNum", article.getDownNum());
            articleItem.put("reviewNum", article.getReviewNum());
            item.put("article", articleItem);
            Actor author = actorMapper.selectById(article.getActorId());
            Map<String, Object> actorItem = new HashMap<>();
            actorItem.put("actorId", author.getActorId());
            actorItem.put("name", author.getName());
            actorItem.put("avatar", author.getPhoto());
            actorItem.put("selfDesc", author.getIntroduction());
            item.put("author", actorItem);
            // 获取用户对这篇文章的态度
            Map<String, Object> userAction = new HashMap<>();
            if (userId != null) {
                UserArticle userArticle = userArticleMapper.selectOne(new QueryWrapper<UserArticle>()
                        .eq("actor_id", userId)
                        .eq("article", article.getArticleId())
                        .last("limit 1"));
                if (userArticle != null) {
                    userAction.put("up", userArticle.getUp());
                    userAction.put("down", userArticle.getDown());
                }
            } else {
                userAction.put("up", false);
                userAction.put("down", false);
            }
            item.put("action", userAction);
            resList.add(item);
        }
        return new Gson().toJson(resList);
    }

    @Override
    public String getArticleDetail(String articleId) {
        Article article = articleMapper.selectById(articleId);
        return new Gson().toJson(article);
    }

    @Override
    public String postArticle(Article article) {
        if (Objects.equals(article.getTitle(), "") ||
                Objects.equals(article.getContent(), "")) {
            return null;
        }
        article.setArticleId(UniqueIdUtil.getID());
        article.setDownNum(0);
        article.setUpNum(0);
        article.setReviewNum(0);
        articleMapper.insert(article);
        return new Gson().toJson(article);
    }
}
