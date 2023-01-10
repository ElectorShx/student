package com.shx.student.mapper;

import com.shx.student.pojo.Major;

import java.util.List;

public interface MajorMapper {
    /**
     *
     * @param Mname 专业的名字
     * @return 专业的名字和其系号
     */
    Major findByMname(String Mname);

    /**
     *
     * @param dno 系的系号
     * @return 所有该系的专业
     */
    List<String> findAllMajorByDno(Integer dno);

    Integer insert(Major major);
}
