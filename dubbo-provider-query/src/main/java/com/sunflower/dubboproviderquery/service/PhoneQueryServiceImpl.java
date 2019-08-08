package com.sunflower.dubboproviderquery.service;

import com.alibaba.dubbo.config.annotation.Service;

import com.sunflower.dubboapi.model.Phone;
import com.sunflower.dubboapi.service.IPhoneQueryService;
import com.sunflower.dubboproviderquery.dao.PhoneQueryDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class PhoneQueryServiceImpl implements IPhoneQueryService
{
    @Autowired
    private PhoneQueryDao dao;
    @Override
    public Phone findById(Long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Phone> findAll()
    {
        return dao.findAll();
    }
}
