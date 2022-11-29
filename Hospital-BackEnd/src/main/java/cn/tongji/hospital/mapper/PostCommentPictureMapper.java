package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.PostCommentPicture;
import cn.tongji.hospital.model.PostCommentPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostCommentPictureMapper {
    long countByExample(PostCommentPictureExample example);

    int deleteByExample(PostCommentPictureExample example);

    int insert(PostCommentPicture record);

    int insertSelective(PostCommentPicture record);

    List<PostCommentPicture> selectByExample(PostCommentPictureExample example);

    int updateByExampleSelective(@Param("record") PostCommentPicture record, @Param("example") PostCommentPictureExample example);

    int updateByExample(@Param("record") PostCommentPicture record, @Param("example") PostCommentPictureExample example);
}