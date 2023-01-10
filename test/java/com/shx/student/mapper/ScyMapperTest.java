package com.shx.student.mapper;

import com.shx.student.pojo.Scy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ScyMapperTest {
    @Autowired
    ScyMapper scyMapper;
    @Test
    public void select(){
        //List<Scy> listsno =scyMapper.selectBySno(1);
        //List<Scy> listcludno=scyMapper.selectByCludno(101);
        Scy scy=scyMapper.select(2,102);
        System.out.println(scy);
    }
    @Test
    public void  insert(){
        Scy scy=new Scy();
        scy.setCludno(103);
        scy.setSno(1);
        scyMapper.insert(scy);
    }
    @Test
    public void delete(){
        Integer rows=scyMapper.delete(7,104);
        System.out.println(rows);
    }
}
