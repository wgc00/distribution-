package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustClient;
import com.wgc.logistics.entity.AugustClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustClientMapper {
    long countByExample(AugustClientExample example);

    int deleteByExample(AugustClientExample example);

    int deleteByPrimaryKey(Integer clientId);

    int insert(AugustClient record);

    int insertSelective(AugustClient record);

    List<AugustClient> selectByExample(AugustClientExample example);

    AugustClient selectByPrimaryKey(Integer clientId);

    int updateByExampleSelective(@Param("record") AugustClient record, @Param("example") AugustClientExample example);

    int updateByExample(@Param("record") AugustClient record, @Param("example") AugustClientExample example);

    int updateByPrimaryKeySelective(AugustClient record);

    int updateByPrimaryKey(AugustClient record);
}