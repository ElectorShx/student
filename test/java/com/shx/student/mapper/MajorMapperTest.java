package com.shx.student.mapper;

import com.shx.student.pojo.Major;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MajorMapperTest {
    @Autowired
    private MajorMapper majorMapper;

    @Test
    public void findByMname(){
        Major major=majorMapper.findByMname("测试专业");
        System.out.println(major);
    }
    @Test
    public void findAll(){
        List<String> list =majorMapper.findAllMajorByDno(201);
        System.out.println(list);
    }
}
