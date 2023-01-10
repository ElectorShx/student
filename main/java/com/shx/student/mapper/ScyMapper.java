package com.shx.student.mapper;

import com.shx.student.pojo.Scy;

import java.util.List;

public interface ScyMapper {
    Integer insert(Scy scy);
    List<Scy> selectBySno(Integer sno);

    List<Scy> selectByCludno(Integer cludno);

    Scy select(Integer sno,Integer cludno);

    Integer delete(Integer sno,Integer cludno);
}
