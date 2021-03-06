package com.zhuxs.result.domain;

import com.zhuxs.result.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by shusesshou on 2017/9/20.
 */
public interface  UserDao extends JpaRepository<User,Long>{

    @Transactional
    User findUserByUsername(String username);
}
