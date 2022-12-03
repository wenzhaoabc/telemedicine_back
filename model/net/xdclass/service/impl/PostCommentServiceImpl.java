package net.xdclass.service.impl;

import net.xdclass.model.PostCommentDO;
import net.xdclass.mapper.PostCommentMapper;
import net.xdclass.service.PostCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 一级评论 服务实现类
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Service
public class PostCommentServiceImpl extends ServiceImpl<PostCommentMapper, PostCommentDO> implements PostCommentService {

}
