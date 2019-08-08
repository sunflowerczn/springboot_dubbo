package com.sunflower.dubboapi.service;

import com.sunflower.dubboapi.model.Phone;

public interface PhoneModifyService
{
    void add(Phone phone);
    void delete(int id);
}
