package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustOrderList;
import com.wgc.logistics.entity.AugustOrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustOrderListMapper {
    long countByExample(AugustOrderListExample example);

    int deleteByExample(AugustOrderListExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(AugustOrderList record);

    int insertSelective(AugustOrderList record);

    List<AugustOrderList> selectByExample(AugustOrderListExample example);

    AugustOrderList selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") AugustOrderList record, @Param("example") AugustOrderListExample example);

    int updateByExample(@Param("record") AugustOrderList record, @Param("example") AugustOrderListExample example);

    int updateByPrimaryKeySelective(AugustOrderList record);

    int updateByPrimaryKey(AugustOrderList record);
}