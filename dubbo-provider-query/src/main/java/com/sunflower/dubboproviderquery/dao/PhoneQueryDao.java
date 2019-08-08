package com.sunflower.dubboproviderquery.dao;

import com.sunflower.dubboapi.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneQueryDao extends JpaRepository<Phone,Long>
{

}
