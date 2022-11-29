package cn.tongji.hospital.mapper;

import cn.tongji.hospital.model.Actor;
import cn.tongji.hospital.model.ActorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActorMapper {
    long countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Long actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Long actorId);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}