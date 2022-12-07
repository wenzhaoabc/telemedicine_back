package cn.tongji.hospital.controller;

import cn.tongji.hospital.dto.DoctorInfoDto;
import cn.tongji.hospital.service.PersonalInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("getDoctorInfo")
    public ResponseEntity<DoctorInfoDto> getDoctorInfo(
            @RequestParam(value = "doctorId") Long doctorId
    ){
        try {
            return ResponseEntity.ok(personalInfoService.getDoctorInfo(doctorId));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

    @GetMapping("getDoctorState")
    public ResponseEntity<Boolean> getDoctorState(
            @RequestParam(value = "doctorId") Long doctorId
    ){
        try {
            return ResponseEntity.ok(WebSocketServer.getDoctorState(String.valueOf(doctorId)));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

    @PostMapping("updateDoctorState")
    public ResponseEntity<String>updateDoctorState(
            @RequestParam(value = "doctorId") Long doctorId
    ){
        try {
            WebSocketServer.updateDoctorState(String.valueOf(doctorId),false);
            return ResponseEntity.ok("医生状态成功改变");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(401).body(null);
        }
    }

}
