package com.shx.student.mapper;

import com.shx.student.pojo.Clud;

import java.awt.*;
import java.util.Date;
import java.util.List;

public interface CludMapper {
    /**
     * 插入学会数据
     * @param clud 学会数据
     * @return 收影响的行数的返回
     */
    Integer insert(Clud clud);

    /**
     * 根据学会的学会号来查询学会的数据
     * @param cludno
     * @return 返回学会的数据，没有则返回null
     */
    Clud findByCludno(int cludno);

    List<Clud> findAll();




}
