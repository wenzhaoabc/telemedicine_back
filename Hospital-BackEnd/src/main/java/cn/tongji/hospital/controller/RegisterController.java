package cn.tongji.hospital.controller;

import cn.tongji.hospital.service.RegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : 王晨
 * @Date : Created in 14:52 2022/11/2
 */
@RestController
@RequestMapping("api/register")
public class RegisterController {
    @Resource
    RegisterService registerService;

    @PostMapping("user")
    public ResponseEntity<String> userRegister(
            @RequestParam(value = "t") Long t
    ){
        try {
            registerService.registerTest(t);
            return ResponseEntity.ok("测试注册成功");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(201).body("测试注册失败");
        }
    }
}
