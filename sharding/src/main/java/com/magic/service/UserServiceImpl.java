package com.magic.service;

import com.magic.po.User;
import com.magic.repository.UserRepository;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by magic on 2020/1/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        // 强制路由主库
        HintManager.getInstance().setMasterRouteOnly();
        return userRepository.list();
    }

    public Long add(User user) {
        return userRepository.addUser(user);
    }
}
