package com.shx.student.service;

import com.shx.student.pojo.Department;
import com.shx.student.service.ex.ServiceException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DepartmentServiceTest {
    @Autowired
    private IDepartmentService departmentService;

    @Test
    public void insert(){
        try {
            Department department=new Department();
            department.setDno(204);
            department.setDname("Service测试系");
            department.setDorm("测试宿舍");
            department.setDlocation("无");
            departmentService.insert(department);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void findAllDepartment(){
        List<Department>list=departmentService.findAllDepartment();
        System.out.println(list);
    }

    @Test
    public void findByDno(){
        Department department=departmentService.findByDno(201);
        System.out.println(department);
    }
}
