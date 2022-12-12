package cn.tongji.hospital.service;


import cn.tongji.hospital.dto.ImageUploadDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

public interface ForumQAService {
    String getTopicList(Integer pageSize, Integer offset, Long userId);

    String getUserBriefInfo(Long userId);

    String postImage(ImageUploadDto file);
}
