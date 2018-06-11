package com.betteryanwo.dao;

import com.betteryanwo.entity.Address;
import org.apache.ibatis.annotations.Param;

/**
 * Create by 六
 * Date:18-5-29
 */
public interface AddressDao {
    /**
     * 根据地址ID得到地址的信息
     * @param id
     * @return
     */
    Address getAddressById(@Param("id") Long id);

    /**
     * 根据用户ID得到地址ID
     * @param userId
     * @return
     */
    long getAddressIdByUserId(@Param("userId") Long userId);
}
