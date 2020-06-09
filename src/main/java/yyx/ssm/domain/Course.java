package yyx.ssm.domain;

import java.util.List;

public class Course {
    private long couid;
    private String couname;
    private List<Student> studentList;
    public long getCouid() {
        return couid;
    }

    public void setCouid(long couid) {
        this.couid = couid;
    }

    public String getCouname() {
        return couname;
    }

    public void setCouname(String couname) {
        this.couname = couname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "couid=" + couid +
                ", couname='" + couname + '\'' +
                '}';
    }
}
