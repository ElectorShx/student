package com.shx.student.mapper;

import com.shx.student.pojo.Student;

public interface StudentMapper {
    Student findBySno(Integer sno);

    Integer insert(Student student);

}
