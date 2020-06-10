package yyx.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yyx.ssm.domain.Course;
import yyx.ssm.service.CourseService;
import yyx.ssm.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @RequestMapping("showAll")
    public String showAll(Model model){
        List<Course> list=courseService.showAll();
        model.addAttribute("couList", list);
        return "course/showAll";
    }

    @RequestMapping("showAdd")
    public String showAddCourse(Model model){
        return "course/showAdd";
    }

    @RequestMapping("addCourse")
    public String addCourse(HttpServletRequest request,Model model){
        String couname=request.getParameter("couname");
        Course course=new Course();
        course.setCouname(couname);
        courseService.saveCourse(course);
        return "course/info";
    }

    @RequestMapping("delete")
    public String delete(HttpServletRequest request,Model model){
        String couid=request.getParameter("couid");
        courseService.deleteStudentCourseRelationByCouid(couid);
        courseService.deleteById(couid);
        model.addAttribute("info", "删除成功");
        return "course/info";
    }
}
