package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustProvince;
import com.wgc.logistics.entity.AugustProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustProvinceMapper {
    long countByExample(AugustProvinceExample example);

    int deleteByExample(AugustProvinceExample example);

    int deleteByPrimaryKey(Integer provinceId);

    int insert(AugustProvince record);

    int insertSelective(AugustProvince record);

    List<AugustProvince> selectByExample(AugustProvinceExample example);

    AugustProvince selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") AugustProvince record, @Param("example") AugustProvinceExample example);

    int updateByExample(@Param("record") AugustProvince record, @Param("example") AugustProvinceExample example);

    int updateByPrimaryKeySelective(AugustProvince record);

    int updateByPrimaryKey(AugustProvince record);
}