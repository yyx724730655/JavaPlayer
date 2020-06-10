package yyx.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yyx.ssm.domain.Course;

import java.util.List;

@Repository
public interface CourseDao {
    List<Course> showAll();

    void saveCourse(Course course);

    void deleteById(String couid);

    void deleteStudentCourseRelationByCouid(String couid);

    List<Course> findCourseBySid(@Param("sid") String sid);
}
