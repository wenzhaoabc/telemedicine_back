package cn.tongji.hospital.controller;

import cn.tongji.hospital.model.UserAnswer;
import cn.tongji.hospital.model.UserArticle;
import cn.tongji.hospital.model.UserLike;
import cn.tongji.hospital.model.UserReview;
import cn.tongji.hospital.service.UserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/action")
public class UserActionController {
    @Autowired
    private UserActionService userActionService;

    @PostMapping("/article")
    public ResponseEntity<Boolean> toArticle(UserArticle userArticle) {
        try {
            return ResponseEntity.ok(userActionService.toArticle(userArticle));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping("/review")
    public ResponseEntity<Boolean> toReview(UserReview userReview) {
        try {
            return ResponseEntity.ok(userActionService.toReview(userReview));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping("/answer")
    public ResponseEntity<Boolean> toAnswer(UserAnswer userAnswer) {
        try {
            return ResponseEntity.ok(userActionService.toAnswer(userAnswer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping("/liked")
    public ResponseEntity<Boolean> toUserLike(UserLike userLike) {
        try {
            return ResponseEntity.ok(userActionService.toUserLiked(userLike));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @DeleteMapping("/liked")
    public ResponseEntity<Boolean> toCancelUserLiked(UserLike userLike) {
        try {
            return ResponseEntity.ok(userActionService.toCancelLiked(userLike));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }
}
