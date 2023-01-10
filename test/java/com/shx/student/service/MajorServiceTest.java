package com.shx.student.service;

import com.shx.student.pojo.Major;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MajorServiceTest {
    @Autowired
    private IMajorService majorService;

    @Test
    public void insert(){
        Major major=new Major();
        major.setDno(201);
        major.setMname("业务层测试数2");
        majorService.insert(major);
    }
}
