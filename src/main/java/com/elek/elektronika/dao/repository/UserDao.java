package com.elek.elektronika.dao.repository;

import com.elek.elektronika.dao.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User user);

}
