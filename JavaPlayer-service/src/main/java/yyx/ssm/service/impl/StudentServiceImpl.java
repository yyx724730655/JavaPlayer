package yyx.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.ssm.dao.StudentDao;
import yyx.ssm.domain.Student;
import yyx.ssm.service.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public List<Student> findStudentByCid(String cid) {
        return studentDao.findStudentByCid(cid);
    }

    @Override
    public void saveStudentCourse(String sid, List<String> couidList) {
        studentDao.saveStudentCourse(sid,couidList);
    }
}
