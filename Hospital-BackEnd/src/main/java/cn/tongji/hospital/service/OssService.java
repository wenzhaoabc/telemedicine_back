package cn.tongji.hospital.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author : 王晨
 * @Date : Created in 21:21 2022/11/14
 */
@Service
public interface OssService {
    String uploadFile(MultipartFile file);

    Boolean deleteFile(String fileUrl);
}
