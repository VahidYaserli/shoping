package com.elek.elektronika.dao.repository;

import com.elek.elektronika.dao.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);
}
