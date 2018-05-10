import com.hwa.mybatis.consts.GenderEnum;
import com.hwa.mybatis.dao.StudentDao;
import com.hwa.mybatis.model.Student;
import com.hwa.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author LiuHua
 * @date 2018/5/10
 */
public class MybatisTest {

    private static SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public static void main(String[] args) {
        insertStudent();
//        deleteStudentByNumber();
//        updateStudentByNumber();
//        getStudentByNumber();
    }

    private static void insertStudent() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setGender(GenderEnum.MALE);
        student.setNumber("20180510004");
        studentDao.insertStudent(student);
        sqlSession.commit();
        sqlSession.close();
    }

    private static void deleteStudentByNumber() {
    }

    private static void updateStudentByNumber() {
    }

    private static void getStudentByNumber() {
    }


}
