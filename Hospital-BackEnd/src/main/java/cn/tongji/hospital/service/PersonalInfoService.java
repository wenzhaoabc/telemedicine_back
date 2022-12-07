package cn.tongji.hospital.service;

import cn.tongji.hospital.dto.DoctorInfoDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 14:12 2022/12/4
 */
@Service
public interface PersonalInfoService {
    List<DoctorInfoDto> getDoctorsInfo();

    DoctorInfoDto getDoctorInfo(Long doctorId);
}
