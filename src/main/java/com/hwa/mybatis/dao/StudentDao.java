package com.hwa.mybatis.dao;

import com.hwa.mybatis.model.Student;

import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/11
 */
public interface StudentDao {

    //获取所有学生信息
    public List<Student> selectAllStudents();

    //新增学生信息
    public int insertStudent(Student student);
}
