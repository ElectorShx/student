package com.shx.student.service;

import com.shx.student.pojo.Clud;
import com.shx.student.pojo.Scy;
import com.shx.student.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Scanner;

@SpringBootTest
public class CludServiceTest {
    @Autowired
    private ICludService iCludService;
    @Test
    public void addCLud(){
        try {
            Clud clud =new Clud();
            clud.setLocation("无");
            clud.setCludno(104);
            clud.setCludname("业务层添加学会");
            iCludService.addClud(clud);
            System.out.println("ok");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findAll(){
        try {
            List<Clud> list=iCludService.findCludAll();
            System.out.println(list);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void addStudent(){
        iCludService.addStudent(10,104);
    }

    @Test
    public void findByCludno(){
        List<Scy> list=iCludService.findByCludno(102);
        System.out.println(list);
    }
    @Test
    public void delete(){
        iCludService.deleteScy(5,105);
    }
}
