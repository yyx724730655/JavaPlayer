package yyx.ssm.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
    private long sid;
    private String sname;
    private String sex;
    private Date birthday;
    private Classes cid;
    private List<Course> courseList;
    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Classes getCid() {
        return cid;
    }

    public void setCid(Classes cid) {
        this.cid = cid;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", cid=" + cid +
                ", courseList=" + courseList +
                '}';
    }
}
