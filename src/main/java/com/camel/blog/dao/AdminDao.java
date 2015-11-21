package com.camel.blog.dao;

import com.camel.blog.bean.Admin;

public interface AdminDao {
    
    public Admin getAdmin(String userName);
    
}
