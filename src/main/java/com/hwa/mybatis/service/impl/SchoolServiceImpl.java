package com.hwa.mybatis.service.impl;

import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.dao.TeacherDao;
import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.model.Teacher;
import com.hwa.mybatis.service.SchoolService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author LiuHua
 * @date 2018/5/14
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private StudentDao studentDao;

    @Resource
    private TeacherDao teacherDao;

    @Transactional
    public void insertTeacherAndStudent(Teacher teacher, Student student) {
        studentDao.insertStudent(student);
        teacherDao.insertTeacher(teacher);
    }
}
