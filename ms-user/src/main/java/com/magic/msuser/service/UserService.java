package com.magic.msuser.service;

import com.magic.msuser.domain.entity.User;
import com.magic.msuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/11/2.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id){
        return this.userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("用户不存在"));
    }

}
