package com.shx.student.service;

import com.shx.student.pojo.Department;

import java.util.List;

public interface IDepartmentService {
    /**
     * 添加系数据
     * @param department
     */
    void insert(Department department);

    /**
     * 查找所有系的数据
     * @return 系的集合
     */
    List<Department> findAllDepartment();

    Department findByDno(Integer dno);
}
