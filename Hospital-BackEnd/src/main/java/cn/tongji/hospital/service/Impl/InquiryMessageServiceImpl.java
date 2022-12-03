package cn.tongji.hospital.service.Impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.tongji.hospital.mapper.ChatMapper;
import cn.tongji.hospital.model.Chat;
import cn.tongji.hospital.service.InquiryMessageService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @Author : 王晨
 * @Date : Created in 18:13 2022/12/2
 */
@Service
public class InquiryMessageServiceImpl implements InquiryMessageService {

    @Resource
    ChatMapper chatMapper;

    @Override
    public Chat sendMessage(Long receiverId, String value,Integer kind) {
        Chat chat=new Chat();
        chat.setKind(kind);
        chat.setValue(value);
        chat.setReceiverId(receiverId);
        chat.setSenderId(Long.parseLong((String)StpUtil.getLoginId()));
        chat.setRecordId(1L);
        TimeZone time=TimeZone.getTimeZone("Etc/GMT-8");
        TimeZone.setDefault(time);
        Date date = new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        chat.setCreateTime(timestamp);
        chatMapper.insert(chat);
        return chat;
    }

    @Override
    public List<Chat> getChatMessage(Long chaterId) {
        QueryWrapper<Chat> queryWrapper=new QueryWrapper<>();
        Long myId=Long.parseLong((String)StpUtil.getLoginId());
        queryWrapper.eq("sender_id",myId).eq("receiver_id",chaterId)
                .or(wq->wq.eq("sender_id",chaterId).eq("receiver_id",myId));

        List<Chat> chats = chatMapper.selectList(queryWrapper);
        return chats;
    }
}
