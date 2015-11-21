package com.camel.blog.bean;

import java.io.Serializable;

/**
 * Created by QYD on 2015/11/18.
 */
public class TestBean {
	//private static final long serialVersionUID = -2665499037929447906L;
	
	private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
