package com.shx.student.service.impl;

import com.shx.student.mapper.ClassMapper;
import com.shx.student.mapper.ScyMapper;
import com.shx.student.mapper.StudentMapper;
import com.shx.student.pojo.Class;
import com.shx.student.pojo.Scy;
import com.shx.student.pojo.Student;
import com.shx.student.service.IStudentService;
import com.shx.student.service.ex.ClassNullException;
import com.shx.student.service.ex.StudentDuplicationException;
import com.shx.student.service.ex.StudentInsertException;
import com.shx.student.service.ex.StudentNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ClassMapper classMapper;
    @Autowired
    ScyMapper scyMapper;
    @Override
    public void insert(Student student) {
        //先查询该学号的学生是否存在
        Student result=studentMapper.findBySno(student.getSno());
        if (result!=null){
            throw new StudentDuplicationException("该学号已存在");
        }
        //再查该班号是否存在
        Class c=classMapper.findByClassno(student.getClassno());
        if(c==null){
            throw new ClassNullException("该班号不存在");
        }
        Integer rows=studentMapper.insert(student);
        if(rows!=1){
            throw new StudentInsertException("添加过程出现未知操做");
        }
    }

    @Override
    public Student findBySno(Integer sno) {
        Student student=studentMapper.findBySno(sno);
        if(student==null){
            throw new StudentNullException("不存在该学生");
        }

        return student;
    }

    @Override
    public List<Scy> findBySnoInScy(Integer sno) {
        List<Scy> list=scyMapper.selectBySno(sno);
        if(list.size()==0){
            throw new StudentNullException("该学生没有学会数据");
        }
        return list;
    }
}
