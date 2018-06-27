package com.betteryanwo.service;

import com.betteryanwo.entity.Address;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-25
 */
public interface AddressService {

    /**
     * 根据用户ID得到地址的ID。
     * 根据地址ID得到地址的信息。
     * @param userId
     * @return
     */
    List<Address> getAddressById(Long userId);

    /**
     * 保存地址
     * @param address
     * @return
     */
    int insertAddress(Address address);

    /**
     * 删除地址
     * @param addressId
     * @return
     */
    int delAddress(Long addressId);

    /**
     * 得到地址根据地址ID
     * @param addressId
     * @return
     */
    Address getAddressByAddressId(Long addressId);

    /**
     * 修改地址
     * @param address
     * @return
     */
    int updateAddress(Address address);
}
