package com.sunflower.dubboapi.service;

import com.sunflower.dubboapi.model.Phone;

import java.util.List;

public interface IPhoneQueryService {
    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    Phone findById (Long id);
    List<Phone> findAll();

}
