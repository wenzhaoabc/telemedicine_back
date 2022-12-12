package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.Review;
import cn.tongji.hospital.model.temp.ReviewWithActor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper extends BaseMapper<Review> {
    List<ReviewWithActor> getReviewListWithActor(String fatherType, String fatherId);
}
