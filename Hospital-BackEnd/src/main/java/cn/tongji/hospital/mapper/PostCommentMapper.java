package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.PostComment;
<<<<<<< Updated upstream
import cn.tongji.hospital.model.PostCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostCommentMapper {
    long countByExample(PostCommentExample example);

    int deleteByExample(PostCommentExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(PostComment record);

    int insertSelective(PostComment record);

    List<PostComment> selectByExampleWithBLOBs(PostCommentExample example);

    List<PostComment> selectByExample(PostCommentExample example);

    PostComment selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") PostComment record, @Param("example") PostCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PostComment record, @Param("example") PostCommentExample example);

    int updateByExample(@Param("record") PostComment record, @Param("example") PostCommentExample example);

    int updateByPrimaryKeySelective(PostComment record);

    int updateByPrimaryKeyWithBLOBs(PostComment record);

    int updateByPrimaryKey(PostComment record);
}
=======
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 一级评论 Mapper 接口
 * </p>
 *
 * @author wc
 * @since 2022-12-02
 */
public interface PostCommentMapper extends BaseMapper<PostComment> {

}
>>>>>>> Stashed changes
