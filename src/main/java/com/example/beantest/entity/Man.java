package com.example.beantest.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2019/3/5/005
 * @Time:9:08
 */
@Configuration
public class Man {
    @Bean(name="getOldmanBean")
    public Oldman getDemo(){
        Oldman oldman=new Oldman("hepo",50);
        return oldman;
    }
}
