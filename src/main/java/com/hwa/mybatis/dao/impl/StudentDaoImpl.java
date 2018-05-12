package com.hwa.mybatis.dao.impl;

import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/11
 */
public class StudentDaoImpl extends MyBatisUtil implements StudentDao {
    private static final String NAMESPACE = "StudentMapper.";

    @Override
    public List<Student> selectAllStudents() {
        SqlSession sqlSession = getSqlSession();
        List<Student> list = sqlSession.selectList(NAMESPACE + "selectAllStudents");
        sqlSession.close();
        return list;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession sqlSession = getSqlSession();
        int i = sqlSession.insert(NAMESPACE + "insertStudent", student);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
