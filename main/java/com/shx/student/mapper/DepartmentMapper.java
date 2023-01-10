package com.shx.student.mapper;

import com.shx.student.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    /**
     * 通过系号来查询
     * @param dno 系号
     * @return 系的具体数据
     */
     Department findByDno(Integer dno);

    /**
     * 插入数据
     * @param department 具体数据
     * @return受影响的行号
     */
     Integer insert(Department department);

     List<Department> findAllDepartment();
}
