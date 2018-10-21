package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustCityRegion;
import com.wgc.logistics.entity.AugustCityRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustCityRegionMapper {
    long countByExample(AugustCityRegionExample example);

    int deleteByExample(AugustCityRegionExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(AugustCityRegion record);

    int insertSelective(AugustCityRegion record);

    List<AugustCityRegion> selectByExample(AugustCityRegionExample example);

    AugustCityRegion selectByPrimaryKey(Integer regionId);

    int updateByExampleSelective(@Param("record") AugustCityRegion record, @Param("example") AugustCityRegionExample example);

    int updateByExample(@Param("record") AugustCityRegion record, @Param("example") AugustCityRegionExample example);

    int updateByPrimaryKeySelective(AugustCityRegion record);

    int updateByPrimaryKey(AugustCityRegion record);
}