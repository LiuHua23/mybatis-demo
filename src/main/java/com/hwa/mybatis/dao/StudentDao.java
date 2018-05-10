package com.hwa.mybatis.dao;

import com.hwa.mybatis.model.Student;

/**
 * @author LiuHua
 * @date 2018/5/10
 */
public interface StudentDao {

    //增加学生信息
    public void insertStudent(Student student);

    //根据学号删除学生信息
    public void deleteStudentByNumber(String number);

    //根据学号修改学生信息
    public void updateStudentByNumber(String number);

    //通过学号获取学生信息
    public Student getStudentByNumber(String number);

}
