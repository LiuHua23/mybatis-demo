import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.dao.impl.StudentDaoImpl;
import com.hwa.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/10
 */
public class MybatisTest {
    StudentDao studentDao = new StudentDaoImpl();

//    @Test
    public void testInsertStudent() {
        Student student = new Student();
        student.setStudentName("tom");
        studentDao.insertStudent(student);
        System.out.println("插入的主键为：" + student.getStudentId());
    }

    @Test
    public void testSelectAllStudents() {
        List<Student> studentList = studentDao.selectAllStudents();
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }
}
