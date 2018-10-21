package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustUser;
import com.wgc.logistics.entity.AugustUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustUserMapper {
    long countByExample(AugustUserExample example);

    int deleteByExample(AugustUserExample example);

    int deleteByPrimaryKey(Integer userNubmer);

    int insert(AugustUser record);

    int insertSelective(AugustUser record);

    List<AugustUser> selectByExample(AugustUserExample example);

    AugustUser selectByPrimaryKey(Integer userNubmer);

    int updateByExampleSelective(@Param("record") AugustUser record, @Param("example") AugustUserExample example);

    int updateByExample(@Param("record") AugustUser record, @Param("example") AugustUserExample example);

    int updateByPrimaryKeySelective(AugustUser record);

    int updateByPrimaryKey(AugustUser record);
}