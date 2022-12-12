package cn.tongji.hospital.service;


import java.util.List;

public interface ForumQAService {
    String getTopicList(Integer pageSize, Integer offset, Long userId);
}
