package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.PostComment;
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