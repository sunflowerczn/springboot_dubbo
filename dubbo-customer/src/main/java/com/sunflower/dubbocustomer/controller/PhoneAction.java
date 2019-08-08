package com.sunflower.dubbocustomer.controller;

import com.sunflower.dubboapi.model.Phone;
import com.sunflower.dubboapi.service.IPhoneQueryService;
import com.sunflower.dubboapi.service.PhoneModifyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneAction {
    @Resource
    private IPhoneQueryService iPhoneQueryService;
    @Resource
    private PhoneModifyService phoneModifyService;
    @GetMapping("/findbyid")
    public Phone findById(Long id){
        return  iPhoneQueryService.findById(id);
    }
    @GetMapping("/findall")
    public List<Phone> findAll(){
        return  iPhoneQueryService.findAll();
    }
    @RequestMapping("/add")
    public String add(Phone phone)
    {
        phoneModifyService.add(phone);
        return "添加成功";
    }
    @RequestMapping("/delete")
    public String delete(int id)
    {
        phoneModifyService.delete(id);
        return "删除成功";
    }
}
