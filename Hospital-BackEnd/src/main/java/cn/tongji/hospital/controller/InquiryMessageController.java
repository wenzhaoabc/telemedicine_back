package cn.tongji.hospital.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.tongji.hospital.model.Chat;
import cn.tongji.hospital.service.InquiryMessageService;
import cn.tongji.hospital.service.OssService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 17:56 2022/12/2
 */
@RestController
@RequestMapping("api/inquiry")
public class InquiryMessageController {
    @Resource
    InquiryMessageService inquiryMessageService;

    @Resource
    OssService ossService;

    @PostMapping("sendText")
    public ResponseEntity<Chat> sendTextMessage(
            @RequestParam(value = "receiverId") Long receiverId,
            @RequestBody String value
    ){
        try {
            return ResponseEntity.ok(inquiryMessageService.sendMessage(receiverId,value,0));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

    @PostMapping("sendPicture")
    public ResponseEntity<Chat> sendPicture(
            @RequestPart MultipartFile file,
            @RequestParam(value = "receiverId") Long receiverId
    ){
        try {
            String url = ossService.uploadFile(file);
            return  ResponseEntity.ok(inquiryMessageService.sendMessage(receiverId,url,1));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

    @PostMapping("sendAudio")
    public ResponseEntity<Chat> sendAudio(
            @RequestParam(value = "receiverId") Long receiverId,
            @RequestPart MultipartFile file
    ){
        try {
            String url=ossService.uploadFile(file);
            return ResponseEntity.ok(inquiryMessageService.sendMessage(receiverId,url,2));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

    @GetMapping("getMessage")
    public ResponseEntity<List<Chat>> getChatMessage(
            @RequestParam(value = "chaterId") Long chaterId
    ){
        try {
            return ResponseEntity.ok(inquiryMessageService.getChatMessage(chaterId));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }
}
