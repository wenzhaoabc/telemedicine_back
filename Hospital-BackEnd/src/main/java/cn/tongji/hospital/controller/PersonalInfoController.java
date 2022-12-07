package cn.tongji.hospital.controller;

import cn.tongji.hospital.dto.DoctorInfoDto;
import cn.tongji.hospital.service.PersonalInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 13:56 2022/12/4
 */
@RestController
@RequestMapping("api/personalInfo")
public class PersonalInfoController {
    @Resource
    PersonalInfoService personalInfoService;

    @GetMapping("getDoctorsInfo")
    public ResponseEntity<List<DoctorInfoDto>> getDoctorsInfo(){
        try {
            return ResponseEntity.ok(personalInfoService.getDoctorsInfo());
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }
}
