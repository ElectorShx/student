package com.shx.student.service.impl;

import com.shx.student.mapper.DepartmentMapper;
import com.shx.student.mapper.MajorMapper;
import com.shx.student.pojo.Department;
import com.shx.student.service.IDepartmentService;
import com.shx.student.service.ex.DepartmentDnoDuplicationException;
import com.shx.student.service.ex.DepartmentFindNullException;
import com.shx.student.service.ex.DepartmentInsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private MajorMapper majorMapper;
    @Override
    public void insert(Department department) {
        //先判断数据是否存在
        Integer dno=department.getDno();
        Department result=departmentMapper.findByDno(dno);
        if(result!=null){
            throw new DepartmentDnoDuplicationException("该系的数据已存在");
        }
        department.setDcount(0);
        Integer rows=departmentMapper.insert(department);
        if(rows!=1){
            throw new DepartmentInsertException("插入系数据时出现未知的错误");
        }
    }

    @Override
    public List<Department> findAllDepartment(){
        List<Department> list=departmentMapper.findAllDepartment();
        if(list==null){
            throw new DepartmentFindNullException("不存在系的数据");
        }
        return  list;
    }

    @Override
    public Department findByDno(Integer dno) {
        Department department= departmentMapper.findByDno(dno);
        if(department==null){
            throw new DepartmentFindNullException("不存在该数据");
        }
        department.setMajor(majorMapper.findAllMajorByDno(dno));
        return department;
    }
}
