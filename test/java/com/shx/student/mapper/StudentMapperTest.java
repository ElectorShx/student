package com.shx.student.mapper;

import com.shx.student.pojo.Scy;
import com.shx.student.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void select(){
        System.out.println(studentMapper.findBySno(1));
    }
    @Test
    public void insert(){
        Student student=new Student();
        student.setSno(10);
        student.setSname("毕十");
        student.setAge(21);
        student.setClassno(305);
        Integer rows=studentMapper.insert(student);
        System.out.println(rows);
    }

}
