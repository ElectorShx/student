package com.shx.student.service;

import com.shx.student.pojo.Scy;
import com.shx.student.pojo.Student;

import java.util.List;

public interface IStudentService {
    void insert(Student student);
    Student findBySno(Integer sno);

    List<Scy> findBySnoInScy(Integer sno);
}
