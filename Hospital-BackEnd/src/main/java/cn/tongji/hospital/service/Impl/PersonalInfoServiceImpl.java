package cn.tongji.hospital.service.impl;

import cn.tongji.hospital.dto.DoctorInfoDto;
import cn.tongji.hospital.mapper.ActorMapper;
import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.service.PersonalInfoService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 王晨
 * @Date : Created in 14:13 2022/12/4
 */
@Service
public class PersonalInfoServiceImpl implements PersonalInfoService {

    @Resource
    ActorMapper actorMapper;

    @Override
    public List<DoctorInfoDto> getDoctorsInfo() {
        QueryWrapper<Actor> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("role",1);
        List<Actor> doctors = actorMapper.selectList(queryWrapper);
        List<DoctorInfoDto> doctorInfoDtos=new ArrayList<>();
        for (Actor doctor: doctors) {
            DoctorInfoDto doctorInfoDto=new DoctorInfoDto();
            doctorInfoDto.setDepartment(doctor.getDepartment());
            doctorInfoDto.setAge(doctor.getAge());
            doctorInfoDto.setGender(doctor.getGender());
            doctorInfoDto.setName(doctor.getName());
            doctorInfoDto.setField(doctor.getField());
            doctorInfoDto.setHospital(doctor.getHospital());
            doctorInfoDto.setIntroduction(doctor.getIntroduction());
            doctorInfoDto.setScore(doctor.getScore());
            doctorInfoDto.setPhoto(doctor.getPhoto());
            doctorInfoDto.setActorId(doctor.getActorId());
            doctorInfoDto.setTelephone(doctor.getTelephone());
            doctorInfoDto.setSeviceYear(doctor.getSeviceYear());
            doctorInfoDtos.add(doctorInfoDto);
        }
        return doctorInfoDtos;
    }

    @Override
    public DoctorInfoDto getDoctorInfo(Long doctorId) {
        Actor doctor = actorMapper.selectById(doctorId);
        DoctorInfoDto doctorInfoDto=new DoctorInfoDto();
        doctorInfoDto.setDepartment(doctor.getDepartment());
        doctorInfoDto.setAge(doctor.getAge());
        doctorInfoDto.setGender(doctor.getGender());
        doctorInfoDto.setName(doctor.getName());
        doctorInfoDto.setField(doctor.getField());
        doctorInfoDto.setHospital(doctor.getHospital());
        doctorInfoDto.setIntroduction(doctor.getIntroduction());
        doctorInfoDto.setScore(doctor.getScore());
        doctorInfoDto.setPhoto(doctor.getPhoto());
        doctorInfoDto.setActorId(doctor.getActorId());
        doctorInfoDto.setTelephone(doctor.getTelephone());
        doctorInfoDto.setSeviceYear(doctor.getSeviceYear());
        return doctorInfoDto;
    }
}
