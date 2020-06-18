package yyx.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import yyx.ssm.api.ClassesService;
import yyx.ssm.api.StudentService;
import yyx.ssm.domain.Classes;
import yyx.ssm.domain.Student;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAllClasses")
    public String findAllClasses(Model model){
        List<Classes> list=classesService.findAll();
        model.addAttribute("list",list);
        return "classes/findAll";
    }

    @RequestMapping("/showAddClasses")
    public String showAddClasses(){
        return "classes/showAdd";
    }

    @RequestMapping(value = "/addClasses",method = RequestMethod.POST)
    public String addClasses(HttpServletRequest request,Model model){
        String cname=request.getParameter("cname");
        String category=request.getParameter("category");
        Classes classes=new Classes();
        classes.setCname(cname);
        classes.setCategory(category);
        classesService.saveClasses(classes);
        model.addAttribute("info","添加成功");
        return "classes/info";
    }

    @RequestMapping(value = "/showStudent")
    public String showStudent(Model model,HttpServletRequest request){
        String cid=request.getParameter("cid");
        List<Student> list=studentService.findStudentByCid(cid);
        model.addAttribute("stuList", list);
        return "classes/showstudent";
    }

    @RequestMapping(value = "/deleteClasses")
    public String deleteClasses(Model model, HttpServletRequest request) {
        String cid = request.getParameter("cid");
        classesService.deleteClassesByCid(cid);
        model.addAttribute("info", "删除班级成功");
        return "classes/info";
    }
}
