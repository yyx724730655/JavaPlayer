package yyx.ssm.api;

import yyx.ssm.domain.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAllStudent();

    public Student saveStudent(Student student);

    public List<Student> findStudentByCid(String cid);

    void saveStudentCourse(String sid, List<String> couidList);

    void deleteStudentBySid(String sid);
}
