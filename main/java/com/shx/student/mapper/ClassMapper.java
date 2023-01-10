package com.shx.student.mapper;

import com.shx.student.pojo.Class;

public interface ClassMapper {
    /**
     * 插入函数
     * @param c 班级的数据
     * @return 受影响的行数
     */
    Integer insert(Class c);

    /**
     * 依据班号查询班集数据
     * @param classno
     * @return
     */
    Class findByClassno(Integer classno);
}
