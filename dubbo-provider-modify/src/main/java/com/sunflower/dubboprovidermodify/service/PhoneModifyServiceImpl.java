package com.sunflower.dubboprovidermodify.service;

import com.alibaba.dubbo.config.annotation.Service;

import com.sunflower.dubboapi.model.Phone;
import com.sunflower.dubboapi.service.PhoneModifyService;
import com.sunflower.dubboprovidermodify.dao.PhoneModifyDao;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class PhoneModifyServiceImpl implements PhoneModifyService
{
    @Autowired
    private PhoneModifyDao dao;

    @Override
    public void add(Phone phone) {
       dao.save(phone);
    }

    @Override
    public void delete(int id) {
        dao.deleteById(new Long(id));
    }
}
