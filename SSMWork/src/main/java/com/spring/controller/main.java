package com.spring.controller;

import com.spring.pojo.Admin;
import com.spring.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class main {

    @Resource
    private AdminService adminService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    @ResponseBody
    public int insertAdmin(Admin admin)
    {
        return adminService.insertAdmin(admin);
    }

    @RequestMapping(value = "/admin/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Admin getUers(@PathVariable Integer id){
        return adminService.getAdmin(id);
    }

}
