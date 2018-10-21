package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustArea;
import com.wgc.logistics.entity.AugustAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustAreaMapper {
    long countByExample(AugustAreaExample example);

    int deleteByExample(AugustAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(AugustArea record);

    int insertSelective(AugustArea record);

    List<AugustArea> selectByExample(AugustAreaExample example);

    AugustArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") AugustArea record, @Param("example") AugustAreaExample example);

    int updateByExample(@Param("record") AugustArea record, @Param("example") AugustAreaExample example);

    int updateByPrimaryKeySelective(AugustArea record);

    int updateByPrimaryKey(AugustArea record);
}