package com.shx.student.service.impl;

import com.shx.student.mapper.DepartmentMapper;
import com.shx.student.mapper.MajorMapper;
import com.shx.student.pojo.Department;
import com.shx.student.pojo.Major;
import com.shx.student.service.IMajorService;
import com.shx.student.service.ex.DepartmentFindNullException;
import com.shx.student.service.ex.MajorDuplicationException;
import com.shx.student.service.ex.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorService implements IMajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void insert(Major major) {
        Major result=majorMapper.findByMname(major.getMname());
        if(result!=null){
            throw new MajorDuplicationException("该数据已存在");
        }
        Department department=departmentMapper.findByDno(major.getDno());
        if(department==null){
            throw new DepartmentFindNullException("没有该系的数据");
        }
        Integer rows= majorMapper.insert(major);
        if(rows!=1){
            throw new ServiceException("插入时出现未知错误");
        }
    }
}
