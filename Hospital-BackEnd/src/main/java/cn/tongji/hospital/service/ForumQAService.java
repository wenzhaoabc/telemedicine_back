package cn.tongji.hospital.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ForumQAService {
    String getTopicList(Integer pageSize, Integer offset, Long userId);

    String getUserBriefInfo(Long userId);
}
