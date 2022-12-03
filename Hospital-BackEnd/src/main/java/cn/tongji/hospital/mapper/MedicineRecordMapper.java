package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.MedicineRecord;
<<<<<<< Updated upstream
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
=======
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
public interface MedicineRecordMapper extends BaseMapper<MedicineRecord> {

}
>>>>>>> Stashed changes
