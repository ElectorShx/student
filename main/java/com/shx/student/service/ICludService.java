package com.shx.student.service;

import com.shx.student.pojo.Clud;
import com.shx.student.pojo.Scy;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICludService {
    /**
     * 学会添加方法
     * @param clud 学会的具体数据
     */
    void addClud(Clud clud);

    /**
     * 查找学会的所有数据
     * @return
     */
    List<Clud> findCludAll();

    void addStudent(Integer sno ,Integer cludno);

    List<Scy> findByCludno(Integer cludno);

    void deleteScy(Integer sno,Integer cludno);
}
