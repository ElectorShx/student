package com.shx.student.service;

import com.shx.student.pojo.Class;

public interface IClassService {
    Class findByClassno(Integer classno);

    void insert(Class c);
}
