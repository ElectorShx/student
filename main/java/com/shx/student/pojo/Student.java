package com.shx.student.pojo;

import java.util.Objects;

public class Student {
    //学生：学号（主键）、姓名、年龄、系号（外键）、班号（外键）。
    private Integer sno;
    private String sname;
    private Integer age;

    private Integer classno;

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", classno=" + classno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sno, student.sno) && Objects.equals(sname, student.sname) && Objects.equals(age, student.age) && Objects.equals(classno, student.classno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, sname, age, classno);
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }
}
