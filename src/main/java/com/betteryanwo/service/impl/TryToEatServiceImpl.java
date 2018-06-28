package com.betteryanwo.service.impl;

import com.betteryanwo.dao.TryToEatDao;
import com.betteryanwo.entity.TryToEat;
import com.betteryanwo.exception.LoginException;
import com.betteryanwo.service.TryToEatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author :MaMengna
 * @Date :Create in 14:50 2018/6/12
 */
@Service
public class TryToEatServiceImpl implements TryToEatService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TryToEatServiceImpl.class);

    @Autowired
    private TryToEatDao eatDao;

    String email="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    String phone="^((\\+)?86|((\\+)?86)?)0?1[3458]\\d{9}$|^(((0\\d2|0\\d{2})[- ]?)?\\d{8}|((0\\d3|0\\d{3})[- ]?)?\\d{7})(-\\d{3})?$";
    public int addTryToEat(TryToEat tryToEat){
        if (StringUtils.isEmpty(tryToEat.getCorporateName())){
            throw new LoginException("公司全称不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getcAddress())){
            throw new LoginException("公司地址不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getNumber())){
            throw new LoginException("试吃人数不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getPosition())){
            throw new LoginException("申请人职位不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getApplicant())){
            throw new LoginException("申请人姓名不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getTasting())){
            throw new LoginException("品尝地点不能为空！");
        }
        if (StringUtils.isEmpty(tryToEat.getpThone())){
            throw new LoginException("申请人电话不能为空！");
        }
        if(!tryToEat.getpThone().matches(phone)){
            throw new LoginException("联系电话格式不正确！");
        }
        if(!StringUtils.isEmpty(tryToEat.getpEmail())&&!tryToEat.getpEmail().matches(phone)){
            throw new LoginException("邮箱格式不正确！");
        }
        int t=eatDao.addTryToEat(tryToEat);
        return t;
    }
}
