package cn.tongji.hospital.controller;

import cn.tongji.hospital.model.Article;
import cn.tongji.hospital.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/{articleId}")
    public ResponseEntity<String> getArticleInfo(@PathVariable String articleId) {
        try {
            return ResponseEntity.ok(articleService.getArticleDetail(articleId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping()
    public ResponseEntity<String> postArticle(@RequestBody Article article) {
        try {
            return ResponseEntity.ok(articleService.postArticle(article));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }
}
