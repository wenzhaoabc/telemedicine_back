package cn.tongji.hospital.controller;

import cn.tongji.hospital.model.Review;
import cn.tongji.hospital.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviewList")
    public ResponseEntity<String> getReviewList(@RequestParam("id") String id, @RequestParam("type") String type) {
        try {
            return ResponseEntity.ok(reviewService.getReviewList(id, type));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }

    @PostMapping("write")
    public ResponseEntity<String> postReview(@RequestParam Review review) {
        try {
            return ResponseEntity.ok(reviewService.postReview(review));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(400).body(null);
        }
    }
}
