package yyx.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.ssm.dao.AccountDao;
import yyx.ssm.dao.StudentDao;
import yyx.ssm.domain.Account;
import yyx.ssm.domain.Student;
import yyx.ssm.api.StudentService;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        studentDao.saveStudent(student);
        System.out.println("Service系统返回student主键为"+student.getSid());
        //把新增学生时账户的自动创建放在service实现，之前在controller，发现service返回的student对象无法自动赋值添加后的ID主键
        Account account=new Account();
        account.setAname(student.getSname()+"账户");
        account.setMoney(0);
        account.setSid(student);
        accountDao.saveAccount(account);
        return student;
    }

    @Override
    public List<Student> findStudentByCid(String cid) {
        return studentDao.findStudentByCid(cid);
    }

    @Override
    public void saveStudentCourse(String sid, List<String> couidList) {
        studentDao.saveStudentCourse(sid,couidList);
    }

    @Override
    public void deleteStudentBySid(String sid){
        accountDao.deleteAccountBySid(sid);
        studentDao.deleteStudentCourseBySid(sid);
        studentDao.deleteStudentBySid(sid);
    }
}
