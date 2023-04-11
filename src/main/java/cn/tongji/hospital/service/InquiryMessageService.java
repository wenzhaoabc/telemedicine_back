package cn.tongji.hospital.service;

import cn.tongji.hospital.model.Chat;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 18:12 2022/12/2
 */
@Service
public interface InquiryMessageService {
    Chat sendMessage(Long receiverId,String value,Integer kind);

    List<Chat> getChatMessage(Long chaterId);
}
