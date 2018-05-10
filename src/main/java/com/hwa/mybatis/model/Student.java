package com.hwa.mybatis.model;

import com.hwa.mybatis.consts.GenderEnum;

/**
 * 学生信息实体
 * @author LiuHua
 * @date 2018/5/10
 */
public class Student {

    //姓名
    private String name;

    //年龄
    private int age;

    //性别
    private GenderEnum gender;

    //学号
    private String number;

    public Student() {}

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

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", number='" + number + '\'' +
                '}';
    }
}
