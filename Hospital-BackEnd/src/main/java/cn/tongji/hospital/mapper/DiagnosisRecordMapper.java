package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.DiagnosisRecord;
import cn.tongji.hospital.model.DiagnosisRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiagnosisRecordMapper {
    long countByExample(DiagnosisRecordExample example);

    int deleteByExample(DiagnosisRecordExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(DiagnosisRecord record);

    int insertSelective(DiagnosisRecord record);

    List<DiagnosisRecord> selectByExample(DiagnosisRecordExample example);

    DiagnosisRecord selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") DiagnosisRecord record, @Param("example") DiagnosisRecordExample example);

    int updateByExample(@Param("record") DiagnosisRecord record, @Param("example") DiagnosisRecordExample example);

    int updateByPrimaryKeySelective(DiagnosisRecord record);

    int updateByPrimaryKey(DiagnosisRecord record);
}