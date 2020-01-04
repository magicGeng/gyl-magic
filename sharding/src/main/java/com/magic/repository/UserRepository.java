package com.magic.repository;

import com.magic.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserRepository {
    Long addUser(User user);

    List<User> list();
}
