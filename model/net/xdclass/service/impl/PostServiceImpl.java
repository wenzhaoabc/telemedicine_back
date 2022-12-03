package net.xdclass.service.impl;

import net.xdclass.model.PostDO;
import net.xdclass.mapper.PostMapper;
import net.xdclass.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, PostDO> implements PostService {

}
