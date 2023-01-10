package com.shx.student.service;

import com.shx.student.pojo.Scy;
import com.shx.student.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private IStudentService studentService;
    @Test
    public void insert(){
        Student student=new Student();
        student.setSno(11);
        student.setClassno(305);
        studentService.insert(student);
    }
    @Test
    public void find(){
        Student student=studentService.findBySno(11);
        System.out.println(student);
    }
    @Test
    public void selectBySnoInScy(){
        List<Scy> list=studentService.findBySnoInScy(1);
        System.out.println(list);
    }
}
