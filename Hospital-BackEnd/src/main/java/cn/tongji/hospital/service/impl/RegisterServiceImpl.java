package cn.tongji.hospital.service.impl;

import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.mapper.PostCommentMapper;
import cn.tongji.hospital.model.PostComment;
import cn.tongji.hospital.model.PostCommentExample;
import cn.tongji.hospital.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 14:56 2022/11/2
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    ActorMapper actorMapper;

    @Resource
    PostCommentMapper postCommentMapper;

    public void test(Long actorId){
        PostCommentExample example=new PostCommentExample();
        PostCommentExample.Criteria criteria=example.createCriteria();
        criteria.andActorIdEqualTo(actorId);
        List<PostComment> postComments = postCommentMapper.selectByExample(example);
        for (PostComment postComment : postComments) {
            postComment.setActorId(1L);
        }
    }
}
