package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustLorry;
import com.wgc.logistics.entity.AugustLorryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustLorryMapper {
    long countByExample(AugustLorryExample example);

    int deleteByExample(AugustLorryExample example);

    int deleteByPrimaryKey(Integer lorryNumber);

    int insert(AugustLorry record);

    int insertSelective(AugustLorry record);

    List<AugustLorry> selectByExample(AugustLorryExample example);

    AugustLorry selectByPrimaryKey(Integer lorryNumber);

    int updateByExampleSelective(@Param("record") AugustLorry record, @Param("example") AugustLorryExample example);

    int updateByExample(@Param("record") AugustLorry record, @Param("example") AugustLorryExample example);

    int updateByPrimaryKeySelective(AugustLorry record);

    int updateByPrimaryKey(AugustLorry record);
}