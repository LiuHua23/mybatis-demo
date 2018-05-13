import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.dao.TeacherDao;
import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.model.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuHua
 * @date 2018/5/10
 */
public class MybatisTest {
//    StudentDao studentDao = new StudentDaoImpl();
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    @Test
    public void testInsertAndSelectStudent() {
        StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
        Student student = new Student();
        student.setStudentName("jerry");
        int j = studentDao.insertStudent(student);
        System.out.println("j = " + j + "\n");

        System.out.println("--------Display students-------");
        List<Student> studentList = studentDao.selectAllStudents();
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    }

//    @Test
    public void testInsertAndSelectTeacher() {
        TeacherDao teacherDao = (TeacherDao) context.getBean("teacherDaoImpl");
        Teacher teacher = new Teacher();
        teacher.setTeacherName("张老师");
        int j = teacherDao.insertTeacher(teacher);
        System.out.println("j = " + j + "\n");

        System.out.println("--------Display students-------");
        List<Teacher> teacherList = teacherDao.selectAllTeachers();
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(teacherList.get(i));
        }
    }

    @Test
    public void testBatchInsertStudents() {
        StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setStudentName("tom");
        Student student2 = new Student();
        student2.setStudentName("jerry");

        studentList.add(student1);
        studentList.add(student2);
        studentDao.batchInsertStudent(studentList);

        System.out.println("-----------Display Students-----------");
        studentList = studentDao.selectAllStudents();
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

    }

}
