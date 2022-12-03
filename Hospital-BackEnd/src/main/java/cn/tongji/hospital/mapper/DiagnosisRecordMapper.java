package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.DiagnosisRecord;
<<<<<<< Updated upstream
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
=======
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 整个诊疗记录，包括付款、聊天、评价 Mapper 接口
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
public interface DiagnosisRecordMapper extends BaseMapper<DiagnosisRecord> {

}
>>>>>>> Stashed changes
