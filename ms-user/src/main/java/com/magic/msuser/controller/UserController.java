package com.magic.msuser.controller;

import com.magic.msuser.domain.entity.User;
import com.magic.msuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/2.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        return this.userService.findById(id);
    }

}
