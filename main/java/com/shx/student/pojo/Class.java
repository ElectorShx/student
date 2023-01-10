package com.shx.student.pojo;

import java.util.Date;
import java.util.Objects;

//斑级：班号（主键）、专业名（外键）、入校年份、班级人数。//班号唯一1
public class Class {
    private Integer classno;
    private String majorname;
    private Date classyear;
    private Integer classcount;

    @Override
    public String toString() {
        return "Class{" +
                "classno=" + classno +
                ", majorname='" + majorname + '\'' +
                ", classyear=" + classyear +
                ", classcount=" + classcount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return Objects.equals(classno, aClass.classno) && Objects.equals(majorname, aClass.majorname) && Objects.equals(classyear, aClass.classyear) && Objects.equals(classcount, aClass.classcount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classno, majorname, classyear, classcount);
    }

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public Date getClassyear() {
        return classyear;
    }

    public void setClassyear(Date classyear) {
        this.classyear = classyear;
    }

    public Integer getClasscount() {
        return classcount;
    }

    public void setClasscount(Integer classcount) {
        this.classcount = classcount;
    }
}
