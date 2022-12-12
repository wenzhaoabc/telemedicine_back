package cn.tongji.hospital.controller;

import cn.tongji.hospital.model.Question;
import cn.tongji.hospital.service.ForumQAService;
import cn.tongji.hospital.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.ExportException;
import java.util.List;

@RestController
@RequestMapping("/forum")
public class ForumController {
    @Autowired
    private ForumQAService forumQAService;
    @Autowired
    private QuestionService questionService;

    @GetMapping("/qalist")
    public ResponseEntity<String> getQAList(
            @RequestParam("offset") Integer offset,
            @RequestParam("pagesize") Integer pagesize,
            @RequestParam(value = "userId", defaultValue = "null") Long userId) {
        try {
            return ResponseEntity.ok(forumQAService.getTopicList(pagesize, offset, userId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    // 获取问题
    @GetMapping("/question")
    public ResponseEntity<String> getQuestion(@RequestParam("qid") String qid) {
        try {
            return ResponseEntity.ok(questionService.getQuestion(qid));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping("/question")
    public ResponseEntity<String> postQuestion(@RequestBody Question ques) {
        try {
            String res = questionService.postQuestion(ques);
            return ResponseEntity.ok(res);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @GetMapping("/userquestions")
    public ResponseEntity<String> getUserQuestion(@RequestParam Long actorId) {
        try {
            String res = questionService.getQuestionsByUser(actorId);
            return ResponseEntity.ok(res);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }
}
