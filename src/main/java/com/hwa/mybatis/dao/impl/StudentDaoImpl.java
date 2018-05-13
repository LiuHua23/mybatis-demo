package com.hwa.mybatis.dao.impl;

import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/11
 */
@Repository
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {
    private static final String NAMESPACE = "StudentMapper.";

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Student> selectAllStudents() {
        return getSqlSession().selectList(NAMESPACE + "selectAllStudents");
    }

    @Override
    public int insertStudent(Student student) {
        return getSqlSession().insert(NAMESPACE + "insertStudent", student);
    }

    @Override
    public int batchInsertStudent(List<Student> studentList) {
        return getSqlSession().insert(NAMESPACE  + "batchInsert", studentList);
    }
}
