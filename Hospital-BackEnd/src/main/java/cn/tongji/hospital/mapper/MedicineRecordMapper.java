package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.MedicineRecord;
import cn.tongji.hospital.model.MedicineRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineRecordMapper {
    long countByExample(MedicineRecordExample example);

    int deleteByExample(MedicineRecordExample example);

    int insert(MedicineRecord record);

    int insertSelective(MedicineRecord record);

    List<MedicineRecord> selectByExample(MedicineRecordExample example);

    int updateByExampleSelective(@Param("record") MedicineRecord record, @Param("example") MedicineRecordExample example);

    int updateByExample(@Param("record") MedicineRecord record, @Param("example") MedicineRecordExample example);
}