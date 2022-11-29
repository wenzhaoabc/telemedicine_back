package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.PostPicture;
import cn.tongji.hospital.model.PostPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostPictureMapper {
    long countByExample(PostPictureExample example);

    int deleteByExample(PostPictureExample example);

    int insert(PostPicture record);

    int insertSelective(PostPicture record);

    List<PostPicture> selectByExample(PostPictureExample example);

    int updateByExampleSelective(@Param("record") PostPicture record, @Param("example") PostPictureExample example);

    int updateByExample(@Param("record") PostPicture record, @Param("example") PostPictureExample example);
}