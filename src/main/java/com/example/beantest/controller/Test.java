package com.example.beantest.controller;

import com.example.beantest.Util.SpringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2019/3/5/005
 * @Time:9:13
 */
@RestController
public class Test {

    @RequestMapping("/")
    public Object testmethod(){
        return SpringUtil.getBean("getOldmanBean");
    }
}
