package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Address;
import com.betteryanwo.entity.Users;
import com.betteryanwo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-25
 */
@Controller
@RequestMapping(value = "address")
public class AddressController {
    @Autowired
    AddressService addressService;

    /**
     * 得到地址根据用户ID
     * @param session 用户都保存在session中
     * @return
     */
    @RequestMapping(value = "/getAddress",method = RequestMethod.GET)
    @ResponseBody
    public Result getAddress(HttpSession session) {
        try {
            Users user = (Users)session.getAttribute("user");
            List<Address> addressList = addressService.getAddressById(user.getUserId());
            if (addressList.size() == 0 && null == addressList && !addressList.isEmpty()) {
                return new Result(false, "目前用户还没有地址，请添加地址");
            }
            return new Result(true, addressList, "该用户有地址");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "网络错误，请重试", null);
        }
    }

    /**
     * 保存地址
     * @param address
     * @param userId
     * @return
     */
    @RequestMapping(value = "/saveAddress/{userId}", method = RequestMethod.POST)
    @ResponseBody
    public Result insertAddress(@PathVariable("userId") Long userId,@Valid Address address){
        try {
            address.setUserID(userId);
            int i = addressService.insertAddress(address);
            return new Result(true,i,"保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }

    /**
     * 删除地址
     * @param addressId
     * @return
     */
    @RequestMapping(value = "/delAddress/{addressId}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delAddress(@PathVariable("addressId") Long addressId){
        try{
            int i = addressService.delAddress(addressId);
            if(i<0){
                return new Result(false,"删除失败");
            }
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络故障，请重试");
        }
    }

    @RequestMapping(value = "/selectAddress/{addressId}",method = RequestMethod.GET)
    @ResponseBody
    public Result selectAddress(@PathVariable("addressId") Long addressId){
        try{
            Address address = addressService.getAddressByAddressId(addressId);
            if(null==address){
                return new Result(false,"查无此地址");
            }
            return new Result(true,address,"查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络故障，请重试");
        }
    }

    @RequestMapping(value = "/updateAddress/{addressId}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateAddress(@Valid Address address){
        try{
            int i = addressService.updateAddress(address);
            if(i<0){
                return new Result(false,"保存失败");
            }
            return new Result(true,"保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络故障，请重试");
        }
    }
}
