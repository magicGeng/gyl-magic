package com.magic.service;

import com.magic.po.User;

import java.util.List;

public interface UserService {
    List<User> list();

    Long add(User user);
}

