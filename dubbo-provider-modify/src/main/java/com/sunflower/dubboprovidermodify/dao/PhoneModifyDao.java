package com.sunflower.dubboprovidermodify.dao;


import com.sunflower.dubboapi.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneModifyDao extends JpaRepository<Phone,Long>
{
}
