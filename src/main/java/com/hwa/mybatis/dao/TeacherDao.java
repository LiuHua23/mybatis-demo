package com.hwa.mybatis.dao;

import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.model.Teacher;

import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/11
 */
public interface TeacherDao {

    //获取所有老师信息
    public List<Teacher> selectAllTeachers();

    //新增老师信息
    public int insertTeacher(Teacher teacher);
}
