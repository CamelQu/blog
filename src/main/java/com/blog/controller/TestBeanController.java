package com.blog.controller;

import com.blog.model.TestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by QYD on 2015/11/18.
 */
@Controller
@RequestMapping("/test/name")
public class TestBeanController {
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody
    TestBean getShopInJSON(@PathVariable String name) {

        TestBean bean = new TestBean();
        bean.setName(name);
        bean.setPassword(name + "password");

        return bean;

    }
}
