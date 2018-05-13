package com.hwa.mybatis.dao.impl;

import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.dao.TeacherDao;
import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.model.Teacher;
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
public class TeacherDaoImpl extends SqlSessionDaoSupport implements TeacherDao {
    private static final String NAMESPACE = "TeacherMapper.";

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Teacher> selectAllTeachers() {
        return getSqlSession().selectList(NAMESPACE + "selectAllTeachers");
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        return getSqlSession().insert(NAMESPACE + "insertTeacher", teacher);
    }
}
