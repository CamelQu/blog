package com.camel.blog.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.camel.blog.bean.Admin;
import com.camel.blog.dao.AdminDaoImp;

/**
 * Created by QYD on 2015/11/18.
 */
@RestController
public class TestBeanController {
    private static final Logger LOG = Logger.getLogger(TestBeanController.class);
    @Autowired
    private AdminDaoImp adminDao;
	
	@RequestMapping("/test.do")
    public ModelAndView getShopInJSON(@RequestParam("name") String name, @RequestParam("pass") String pass) {
/*
        Admin admin = adminDao.getAdmin(name);
        if (admin != null && !admin.getUserName().equals(""))
            return admin;
        else {
            LOG.error("password is wrong!");
            return null;
        }*/
		ModelAndView mv = new ModelAndView("test");
        mv.addObject("name", "My First Spring Mvc");
        mv.addObject("address", "你猜猜看");
        mv.addObject("age", "2222");
        return mv;
    }
}
