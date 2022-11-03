package cn.tongji.hospital.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 王晨
 * @Date : Created in 14:41 2022/11/2
 */
@RestController
@RequestMapping("api/login")
public class LoginController {
    @GetMapping("user")
    public ResponseEntity<String> userLogin(
            @RequestParam(value = "mobilePhone") String mobilePhone,
            @RequestParam(value = "password") String password
    ){
        try {
            if(mobilePhone.equals("12345678910")&&password.equals("123456")){
                StpUtil.login(10001);
                return ResponseEntity.ok("登录成功");
            }
            return ResponseEntity.status(201).body("输入账号不存在或密码错误");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(202).body("登录失败,请稍后再试");
        }
    }
}
