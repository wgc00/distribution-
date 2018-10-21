package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustRoute;
import com.wgc.logistics.entity.AugustRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustRouteMapper {
    long countByExample(AugustRouteExample example);

    int deleteByExample(AugustRouteExample example);

    int deleteByPrimaryKey(Integer routeNumber);

    int insert(AugustRoute record);

    int insertSelective(AugustRoute record);

    List<AugustRoute> selectByExample(AugustRouteExample example);

    AugustRoute selectByPrimaryKey(Integer routeNumber);

    int updateByExampleSelective(@Param("record") AugustRoute record, @Param("example") AugustRouteExample example);

    int updateByExample(@Param("record") AugustRoute record, @Param("example") AugustRouteExample example);

    int updateByPrimaryKeySelective(AugustRoute record);

    int updateByPrimaryKey(AugustRoute record);
}