package com.ucmed.service;

import com.ucmed.models.User;

import java.util.List;

/**
 * Created by ZY-LJ-1446 on 2018/3/22.
 */
public interface IUserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    void testRollback();
}
