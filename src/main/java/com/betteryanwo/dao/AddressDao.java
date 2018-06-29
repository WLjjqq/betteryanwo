package com.betteryanwo.dao;

import com.betteryanwo.entity.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-5-29
 */
public interface AddressDao {
   /* *//**
     * 根据用户ID得到地址ID
     * @param userId
     * @return
     *//*
    List<Map<String,Long>> getAddressIdByUserId(@Param("userId") Long userId);

    *//**
     * 根据地址ID得到地址的信息
     * @param ids
     * @return
     *//*
    List<Address> getAddressById(List<Long> ids);*/

    /**
     * 根据用户ID得到地址ID
     * @param userId
     * @return
     */
    List<Map<String,Long>> getAddressIdByUserId(@Param("userId") Long userId);

    /**
     * 根据地址ID得到地址信息
     * @param addressId
     * @return
     */
    Address getAddressById(@Param("addressId") Long addressId);

    /**
     * 添加地址
     * @param address
     * @return
     */
    int insertAddress(Address address);

    /**
     * 删除地址
     * @param addressId
     * @return
     */
    int delAddress(@Param("addressId") Long addressId);

    /**
     * 修改地址
     * @param address
     * @return
     */
    int updateAddress(Address address);

    /**
     * 根据地址ID得到地址
     * @param addressId
     * @return
     */
    Address getAddressByAddressId(Long addressId);


}
