package cn.tongji.hospital.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.model.Actor;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    ActorMapper demoMapper;

    @PostMapping("/user/pwd")
    public Actor login(String phone,String pwd){
        QueryWrapper<Actor> wrapper = new QueryWrapper();
        wrapper.eq("telephone", phone).eq("password", pwd);
        Actor actor=demoMapper.selectOne(wrapper);
        StpUtil.login(actor.getActorId());
        System.out.println(StpUtil.getTokenValue());
        System.out.println(StpUtil.getLoginId());
        return  actor;

    }
//    @PostMapping("/user")
//    public boolean register(RegisterActorDto actorDto){
//        Actor actor=new Actor(actorDto.getName(),actorDto.getPwd(),actorDto.getGender(),actorDto.getAge(),actorDto.getPhone());
//        demoMapper.insert(actor);
//        return  true;
//    }
    @GetMapping("/phone")
    public boolean checkPhone(String phone){
        QueryWrapper<Actor> wrapper = new QueryWrapper();
        wrapper.eq("telephone", phone);
        Actor actor=demoMapper.selectOne(wrapper);
        return actor!=null;
    }


}
