package com.shx.student.mapper;

import com.shx.student.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DepartmentTest {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Test
    public void findByDno(){
        Department department = departmentMapper.findByDno(201);
        System.out.println(department);
    }
    @Test
    public void insert(){
        Department department=new Department();
        department.setDno(203);
        department.setDname("Mapper测试系");
        department.setDorm("测试宿舍");
        department.setDlocation("无");
        int rows=departmentMapper.insert(department);
        System.out.println(rows);
    }
    @Test
    public void findAllDepartment(){
        List<Department> list=departmentMapper.findAllDepartment();
        System.out.println(list);
    }
}
