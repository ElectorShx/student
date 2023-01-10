package com.shx.student.service.impl;

import com.shx.student.mapper.ClassMapper;
import com.shx.student.mapper.MajorMapper;
import com.shx.student.pojo.Class;
import com.shx.student.pojo.Major;
import com.shx.student.service.IClassService;
import com.shx.student.service.ex.ClassInsertException;
import com.shx.student.service.ex.ClassNullException;
import com.shx.student.service.ex.ClassnoDuplicationException;
import com.shx.student.service.ex.MajorNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private MajorMapper majorMapper;
    @Override
    public Class findByClassno(Integer classno) {
        Class result=classMapper.findByClassno(classno);
        if(result==null){
            throw new ClassNullException("不存在该班级的数据");
        }
        return result;
    }

    @Override
    public void insert(Class c) {
        Class result=classMapper.findByClassno(c.getClassno());
        if(result!=null){
            throw new ClassnoDuplicationException("该系号已存在");
        }
        Major major=majorMapper.findByMname(c.getMajorname());
        if(major==null){
            throw new MajorNullException("不存在该专业");
        }
        // 补全时间
        Date date=new Date();
        c.setClassyear(date);

        Integer rows=classMapper.insert(c);
        if(rows!=1){
            throw new ClassInsertException("插入过程出现问题");
        }
    }
}
