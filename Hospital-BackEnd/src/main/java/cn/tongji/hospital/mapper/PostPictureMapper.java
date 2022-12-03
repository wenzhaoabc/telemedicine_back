package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.PostPicture;
<<<<<<< Updated upstream
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
public interface PostPictureMapper extends BaseMapper<PostPicture> {

}
>>>>>>> Stashed changes
