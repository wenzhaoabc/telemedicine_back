package net.xdclass.service.impl;

import net.xdclass.model.ChatDO;
import net.xdclass.mapper.ChatMapper;
import net.xdclass.service.ChatService;
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
public class ChatServiceImpl extends ServiceImpl<ChatMapper, ChatDO> implements ChatService {

}
