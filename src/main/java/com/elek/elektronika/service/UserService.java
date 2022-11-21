package com.elek.elektronika.service;

import com.elek.elektronika.dao.entity.User;
import com.elek.elektronika.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    public void save(CrmUser crmUser);
}
