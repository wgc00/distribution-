package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustCity;
import com.wgc.logistics.entity.AugustCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustCityMapper {
    long countByExample(AugustCityExample example);

    int deleteByExample(AugustCityExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(AugustCity record);

    int insertSelective(AugustCity record);

    List<AugustCity> selectByExample(AugustCityExample example);

    AugustCity selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") AugustCity record, @Param("example") AugustCityExample example);

    int updateByExample(@Param("record") AugustCity record, @Param("example") AugustCityExample example);

    int updateByPrimaryKeySelective(AugustCity record);

    int updateByPrimaryKey(AugustCity record);
}