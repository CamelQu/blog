package com.camel.blog.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.camel.blog.bean.Admin;
import com.camel.blog.dao.AdminDao;

@Repository
public class AdminDaoImp extends SqlMapClientDaoSupport implements AdminDao {

    @Override
    public Admin getAdmin(String userName) {
        return (Admin) getSqlMapClientTemplate().queryForObject("admin.getAdmin", userName);
    }
}
