package com.magic.msuser.repository;

import com.magic.msuser.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/11/2.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
