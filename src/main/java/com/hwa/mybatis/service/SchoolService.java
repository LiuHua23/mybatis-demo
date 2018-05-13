package com.hwa.mybatis.service;

import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.model.Teacher;

/**
 * @author LiuHua
 * @date 2018/5/14
 */
public interface SchoolService {
    public void insertTeacherAndStudent(Teacher teacher, Student student);
}
