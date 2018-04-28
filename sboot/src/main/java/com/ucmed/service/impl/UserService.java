package com.ucmed.service.impl;

import com.github.pagehelper.PageHelper;
import com.ucmed.dao.UserMapper;
import com.ucmed.models.User;
import com.ucmed.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZY-LJ-1446 on 2018/3/22.
 */
@Service(value = "userService")
public class UserService implements IUserService{
    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = { Exception.class })
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }


    @Transactional(rollbackFor = { Exception.class })
    @Override
    @Cacheable(value = {"findAllUser#20"})
    public List<User> findAllUser(int pageNum, int pageSize){
            List<User>aa=new ArrayList<User>();
            PageHelper.startPage(pageNum,pageSize);
            return userMapper.selectAllUser();
    }
    @Transactional(rollbackFor = { Exception.class })
    @Override
    public void testRollback(){
        User u = new User();
        u.setUserName("c1");
        u.setPassword("c11");
        u.setPhone("c111");
        userMapper.insertSelective(u);
        User u1 = new User();
        u1.setUserName("c2");
        u1.setPassword("c22");
        userMapper.insertSelective(u1);
    }
}
