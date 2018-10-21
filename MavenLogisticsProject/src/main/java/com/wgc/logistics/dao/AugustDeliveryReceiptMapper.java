package com.wgc.logistics.dao;

import com.wgc.logistics.entity.AugustDeliveryReceipt;
import com.wgc.logistics.entity.AugustDeliveryReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AugustDeliveryReceiptMapper {
    long countByExample(AugustDeliveryReceiptExample example);

    int deleteByExample(AugustDeliveryReceiptExample example);

    int deleteByPrimaryKey(Integer receiptId);

    int insert(AugustDeliveryReceipt record);

    int insertSelective(AugustDeliveryReceipt record);

    List<AugustDeliveryReceipt> selectByExample(AugustDeliveryReceiptExample example);

    AugustDeliveryReceipt selectByPrimaryKey(Integer receiptId);

    int updateByExampleSelective(@Param("record") AugustDeliveryReceipt record, @Param("example") AugustDeliveryReceiptExample example);

    int updateByExample(@Param("record") AugustDeliveryReceipt record, @Param("example") AugustDeliveryReceiptExample example);

    int updateByPrimaryKeySelective(AugustDeliveryReceipt record);

    int updateByPrimaryKey(AugustDeliveryReceipt record);
}