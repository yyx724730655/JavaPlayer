package yyx.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yyx.ssm.domain.Student;

import java.util.List;

@Repository
public interface StudentDao {

//    @Select("select * from student")
    public List<Student> findAllStudent();

//    @Select("select * from student where id =#{id}")
//    @Results({
//            @Result(id=true,column = "id",property = "id"),
//            @Result(column = "name",property = "name"),
//            @Result(column = "sex" ,property = "sex"),
//            @Result(column = "birthday",property = "birthday"),
//            @Result(column = "account",property = "account",one = @One(select = "yyx.ssm.dao.AccountDao.getAccount",fetchType = FetchType.LAZY))
//    })
    public Student getStudentById(long id);

    public void saveStudent(Student student);

    public List<Student> findStudentByCid(String cid);

    void saveStudentCourse(@Param("sid") String sid, @Param("couidList") List<String> couidList);

    void deleteStudentBySid(String sid);

    void deleteStudentCourseBySid(String sid);

    void updateStudentByDeleteClassesCid(String cid);
}
