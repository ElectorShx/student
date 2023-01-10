package com.shx.student.service.impl;

import com.shx.student.mapper.CludMapper;
import com.shx.student.mapper.ScyMapper;
import com.shx.student.mapper.StudentMapper;
import com.shx.student.pojo.Clud;
import com.shx.student.pojo.Scy;
import com.shx.student.pojo.Student;
import com.shx.student.service.ICludService;
import com.shx.student.service.ex.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CludServiceImpl implements ICludService {
    @Autowired
    private CludMapper cludMapper;

    @Autowired
    private  ScyMapper scyMapper;

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void addClud(Clud clud) {
        //先检查数据库中的数据是否存在
        Integer cludno=clud.getCludno();
        Clud result=cludMapper.findByCludno(cludno);
        if(result!=null){
            throw new CludnoDuplicationException("该学会已存在");
        }
        //补全创建时间
        Date date =new Date();
        clud.setCludyear(date);
        if(clud.getLocation()==null){
            clud.setLocation("无");
        }

        Integer rows =cludMapper.insert(clud);
        if(rows!=1){
            throw new CludInsertException("插入是出现未知的问题");
        }
    }

    @Override
    public List<Clud> findCludAll() {
        //先判断是否存在数据
        List<Clud>list=cludMapper.findAll();
        if(list==null){
            throw new CludFindNullException("不存在学会数据");
        }
        return list;
    }

    @Override
    public void addStudent(Integer sno ,Integer cludno) {
        Clud result=cludMapper.findByCludno(cludno);
        if(result==null){
            throw new CludFindNullException("不存在该学会");
        }
        Student student=studentMapper.findBySno(sno);
        if(student==null){
            throw new StudentNullException("该学生不存在");
        }
        Scy scyR=scyMapper.select(sno, cludno);
        if(scyR!=null){
            throw new ScyDuplicationException("已存在该数据");
        }
        Date date=new Date();
        Scy scy=new Scy();
        scy.setSno(sno);
        scy.setCludno(cludno);
        scy.setEyear(date);
        scyMapper.insert(scy);
    }

    @Override
    public List<Scy> findByCludno(Integer cludno) {
        List<Scy> list=scyMapper.selectByCludno(cludno);
        if(list.size()==0){
            throw new CludFindNullException("没有该学会内的学生数据");
        }
        return list;
    }

    @Override
    public void deleteScy(Integer sno, Integer cludno) {
        Scy result=scyMapper.select(sno, cludno);
        if(result==null){
            throw new ScyNullException("不存在该项数据");
        }
        Integer rows=scyMapper.delete(sno,cludno);
        if(rows!=1){
            throw new RuntimeException("删除过程出现错误");
        }
    }
}
