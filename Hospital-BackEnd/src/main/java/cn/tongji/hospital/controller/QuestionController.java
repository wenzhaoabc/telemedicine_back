package cn.tongji.hospital.controller;

import cn.tongji.hospital.model.Question;
import cn.tongji.hospital.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping()
    public ResponseEntity<String> getQuestion(@RequestParam("qId") String qId) {
        try {
            return ResponseEntity.ok(questionService.getQuestion(qId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<String> postQuestion(@RequestBody Question question) {
        try {
            return ResponseEntity.ok(questionService.postQuestion(question));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @GetMapping("/user")
    public ResponseEntity<String> getQuestionsByUser(@RequestParam("userId") String uId) {
        try {
            Long userId = Long.valueOf(uId);
            return ResponseEntity.ok(questionService.getQuestionsByUser(userId));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<String> getQuestionList(
            @RequestParam(value = "userId", defaultValue = "0") String userId,
            @RequestParam(value = "hot", defaultValue = "null") String hot) {
        try {
            Long uId = Long.valueOf(userId);
            String type = String.valueOf(hot);
            return ResponseEntity.ok(questionService.getQuestionList(uId, hot));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }
}
