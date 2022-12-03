package net.xdclass.service.impl;

import net.xdclass.model.DiagnosisRecordDO;
import net.xdclass.mapper.DiagnosisRecordMapper;
import net.xdclass.service.DiagnosisRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 整个诊疗记录，包括付款、聊天、评价 服务实现类
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
@Service
public class DiagnosisRecordServiceImpl extends ServiceImpl<DiagnosisRecordMapper, DiagnosisRecordDO> implements DiagnosisRecordService {

}
