package com.shx.student.mapper;

import com.shx.student.pojo.Clud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootTest
public class CludMapperTest {
    @Autowired
    private CludMapper cludMapper;
    @Test
    public void insert(){
        Clud clud=new Clud();
        clud.setCludname("学会插入测试");
        clud.setCludno(103);
        clud.setLocation("无");
        Integer rows= cludMapper.insert(clud);
        System.out.println(rows);
    }
    @Test
    public void findByCludno(){
        Clud clud =cludMapper.findByCludno(102);
        System.out.println(clud);
    }

    @Test
    public  void findAll(){
        List<Clud> list=cludMapper.findAll();
        System.out.println(list);
    }


}
