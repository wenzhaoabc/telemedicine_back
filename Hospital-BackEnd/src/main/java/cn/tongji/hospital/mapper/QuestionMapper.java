package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zst
 * @since 2022-12-09
 */
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {
    IPage<Question> selectPage(Page<Question> questionPage);

    // 获得关注人的提问
    List<Question> getLovedQuestions(Long userId);
}
