package cn.tongji.hospital.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.tongji.hospital.dto.RegisterActorDto;
import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private ActorMapper demoMapper;

    @PostMapping("/user/pwd")
    public Actor login(String phone,String pwd){
        QueryWrapper<Actor> wrapper = new QueryWrapper();
        wrapper.eq("telephone", phone).eq("password", pwd);
        Actor actor=demoMapper.selectOne(wrapper);
        return  actor;

    }
    @PostMapping("/user")
    public boolean register(RegisterActorDto actorDto){
        Actor actor=new Actor(actorDto.getName(),actorDto.getPwd(),actorDto.getGender(),actorDto.getAge(),actorDto.getPhone());
        demoMapper.insert(actor);
        return  true;
    }
    @GetMapping("/phone")
    public boolean checkPhone(String phone){
        QueryWrapper<Actor> wrapper = new QueryWrapper();
        wrapper.eq("telephone", phone);
        Actor actor=demoMapper.selectOne(wrapper);
        return actor!=null;
    }




}
