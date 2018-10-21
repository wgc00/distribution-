package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustAdmin;
import com.wgc.logistics.entity.AugustAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustAdminMapper {
    long countByExample(AugustAdminExample example);

    int deleteByExample(AugustAdminExample example);

    int deleteByPrimaryKey(Integer adminNumber);

    int insert(AugustAdmin record);

    int insertSelective(AugustAdmin record);

    List<AugustAdmin> selectByExample(AugustAdminExample example);

    AugustAdmin selectByPrimaryKey(Integer adminNumber);

    int updateByExampleSelective(@Param("record") AugustAdmin record, @Param("example") AugustAdminExample example);

    int updateByExample(@Param("record") AugustAdmin record, @Param("example") AugustAdminExample example);

    int updateByPrimaryKeySelective(AugustAdmin record);

    int updateByPrimaryKey(AugustAdmin record);
}