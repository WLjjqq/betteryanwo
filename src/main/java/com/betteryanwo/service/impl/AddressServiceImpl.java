package com.betteryanwo.service.impl;

import com.betteryanwo.dao.AddressDao;
import com.betteryanwo.entity.Address;
import com.betteryanwo.entity.Users;
import com.betteryanwo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Create by 六
 * Date:18-6-25
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressDao addressDao;

    @Override
    public Address getAddressById(Long userId) {
        List<Map<String, Long>> addressId = addressDao.getAddressIdByUserId(userId);
        //List<Long> list = new ArrayList<>();
        Address address=null;
        for(Map<String, Long> map:addressId){
            Set<String> k = map.keySet();
            Iterator<String> it = k.iterator();

            while(it.hasNext()){
                String key = it.next();
                //有了键，就可以通过map集合的get方法获取对应的值
                Long value =map.get(key);
                //list.add(value);
                 address = addressDao.getAddressById(value);
            }
        }

        return address;
    }

    /*@Override
    public Address getAddressById(Long userId) {
        long addressId = addressDao.getAddressIdByUserId(userId);
        if(addressId<0){
            addressId=0;
        }
        return addressDao.getAddressById(addressId);
    }*/

    @Override
    public int insertAddress(Address address) {
        return addressDao.insertAddress(address);
    }

    @Override
    public int delAddress(Long addressId) {
        return addressDao.delAddress(addressId);
    }

    @Override
    public Address getAddressByAddressId(Long addressId) {
        return addressDao.getAddressByAddressId(addressId);
    }

    @Override
    public int updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }
}
