package com.ucmed.hnust.service.impl;

import com.ucmed.hnust.dao.AdminMapper;
import com.ucmed.hnust.pojo.Admin;
import com.ucmed.hnust.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ZY-LJ-1446 on 2018/1/23.
 */
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin selectByAdminInfo(Admin admin) {
        return adminMapper.selectByAdminInfo(admin);
    }
}
