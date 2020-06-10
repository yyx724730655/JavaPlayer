package yyx.ssm.domain;

public class Account {
    private int aid;
    private String aname;
    private double money;
    private Student sid;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Student getSid() {
        return sid;
    }

    public void setSid(Student sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", money=" + money +
                ", sid=" + sid +
                '}';
    }
}
