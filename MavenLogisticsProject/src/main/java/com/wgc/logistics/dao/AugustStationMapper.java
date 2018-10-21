package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustStation;
import com.wgc.logistics.entity.AugustStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustStationMapper {
    long countByExample(AugustStationExample example);

    int deleteByExample(AugustStationExample example);

    int deleteByPrimaryKey(Integer stationId);

    int insert(AugustStation record);

    int insertSelective(AugustStation record);

    List<AugustStation> selectByExample(AugustStationExample example);

    AugustStation selectByPrimaryKey(Integer stationId);

    int updateByExampleSelective(@Param("record") AugustStation record, @Param("example") AugustStationExample example);

    int updateByExample(@Param("record") AugustStation record, @Param("example") AugustStationExample example);

    int updateByPrimaryKeySelective(AugustStation record);

    int updateByPrimaryKey(AugustStation record);
}