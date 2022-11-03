package cn.tongji.hospital.service.impl;

import cn.tongji.hospital.mapper.TestMapper;
import cn.tongji.hospital.model.Test;
import cn.tongji.hospital.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.websocket.server.ServerEndpoint;

/**
 * @Author : 王晨
 * @Date : Created in 14:56 2022/11/2
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    TestMapper testMapper;

    @Override
    public void registerTest(Long t) {
        Test test=new Test();
        test.setT(t);
        testMapper.insert(test);
    }
}
