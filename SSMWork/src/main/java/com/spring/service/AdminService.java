package com.spring.service;

import com.spring.dao.AdminMapper;
import com.spring.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AdminService")
public class AdminService {
    @Resource
    private AdminMapper adminMapper;


    public int insertAdmin(Admin admin){
        return adminMapper.insert(admin);
    }

    public Admin getAdmin(int id){
        Admin admin = adminMapper.selectByPrimaryKey(id);

        if (admin != null)
        {
            return admin;
        }
        return null;
    }
}
