package yyx.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import yyx.ssm.api.AccountService;
import yyx.ssm.api.ClassesService;
import yyx.ssm.api.CourseService;
import yyx.ssm.api.StudentService;
import yyx.ssm.domain.Account;
import yyx.ssm.domain.Classes;
import yyx.ssm.domain.Course;
import yyx.ssm.domain.Student;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassesService classesService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private CourseService courseService;

    private static final Logger logger= Logger.getLogger(Student.class);

    @RequestMapping("student/findAllStudent")
    public String findAllStudent(Model model) {
        List<Student> list=studentService.findAllStudent();
        System.out.println(list);
        model.addAttribute("list",list);
        return "student/findAllStudent";
    }

    @RequestMapping("student/showAddStudent")
    public String showAddStudent(Model model){
        List<Classes> classes=classesService.findAll();
        model.addAttribute("classesList", classes);
        return "student/showAdd";
    }

    @RequestMapping(value = "student/addStudent",method = RequestMethod.POST)
    public String addStudent(Model model, HttpServletRequest request) throws Exception{
        String name=request.getParameter("sname");
        String sex=request.getParameter("sex");
        String birthday=request.getParameter("birthday");
        String classesid=request.getParameter("classesid");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(birthday);
        logger.debug("开始打印日志=========================");
        logger.info("开始===================");
        Classes classes=classesService.findClassesById(classesid);
        Student student=new Student();
        student.setSname(name);
        student.setSex(sex);
        student.setBirthday(date);
        student.setCid(classes);
        Account account=new Account();
        account.setAname(name+"账户");
        account.setMoney(0);
        studentService.saveStudent(student);
        account.setSid(student);
        accountService.saveAccount(account);
        model.addAttribute("info", "添加成功");
        return "student/info";
    }

    @RequestMapping("student/selectCourse")
    public String selectCourse(HttpServletRequest request,Model model){
        model.addAttribute("sid", request.getParameter("sid"));
        List<Course> courses=courseService.showAll();
        model.addAttribute("courseList", courses);
        return "student/selectCourse";
    }

    @RequestMapping("student/addCourse")
    public String addCourse(HttpServletRequest request,Model model){
        String sid=request.getParameter("sid");
        String[] couid=request.getParameterValues("couid");
        List<String> couidList=new ArrayList<>();
        for (int i = 0; i < couid.length; i++) {
            couidList.add(couid[i]);
        }
        studentService.saveStudentCourse(sid,couidList);
        model.addAttribute("info", "课程添加成功");
        return "student/info";
    }

}
