package com.example.beantest.entity;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2019/3/5/005
 * @Time:9:10
 */
public class Oldman {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Oldman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Oldman() {
    }
}
