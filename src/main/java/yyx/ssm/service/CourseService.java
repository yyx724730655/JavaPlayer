package yyx.ssm.service;

import yyx.ssm.domain.Account;
import yyx.ssm.domain.Course;

import java.util.List;

public interface CourseService {

    List<Course> showAll();

    void saveCourse(Course course);

    void deleteById(String couid);

    void deleteStudentCourseRelationByCouid(String couid);
}
