package yyx.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.ssm.dao.CourseDao;
import yyx.ssm.domain.Course;
import yyx.ssm.service.CourseService;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> showAll() {
        return courseDao.showAll();
    }

    @Override
    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }

    @Override
    public void deleteById(String couid) {
        courseDao.deleteById(couid);
    }

    @Override
    public void deleteStudentCourseRelationByCouid(String couid) {
        courseDao.deleteStudentCourseRelationByCouid(couid);
    }
}
