package com.shx.student.mapper;

import com.shx.student.pojo.Class;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClassMapperTest {
    @Autowired
    private ClassMapper classMapper;

    @Test
    public void insert(){
        Class c1=new Class();
        c1.setClassno(304);
        c1.setMajorname("测试专业");
        classMapper.insert(c1);
    }

    @Test
    public void select(){
        Class c2=classMapper.findByClassno(304);
        System.out.println(c2);
    }
}
