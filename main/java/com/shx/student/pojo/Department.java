package com.shx.student.pojo;

import java.util.List;
import java.util.Objects;

public class Department {
    private int dno;
    private String dname;
    private String dlocation;
    private int dcount;
    private String dorm;

    private List<String> major;

    public List<String> getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", dlocation='" + dlocation + '\'' +
                ", dcount=" + dcount +
                ", dorm='" + dorm + '\'' +
                ", major=" + major +
                '}';
    }

    public void setMajor(List<String> major) {
        this.major = major;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return dno == that.dno && dcount == that.dcount && Objects.equals(dname, that.dname) && Objects.equals(dlocation, that.dlocation) && Objects.equals(dorm, that.dorm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dno, dname, dlocation, dcount, dorm);
    }

}
