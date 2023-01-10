package com.shx.student.controller;

import com.shx.student.pojo.Class;
import com.shx.student.pojo.Department;
import com.shx.student.service.IClassService;
import com.shx.student.service.ex.*;
import com.shx.student.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("class")
public class ClassController {
    @Autowired
    private IClassService classService;
    @RequestMapping("insert")
    public JsonResult<Void> insert(Class c){
        JsonResult<Void> result =new JsonResult<>();
        try {
            classService.insert(c);
            result.setState(205);
            result.setMessage("添加成功");
        } catch (ClassInsertException e) {
            result.setState(4008);
            result.setMessage(e.getMessage());
        }catch (ClassnoDuplicationException e){
            result.setState(4009);
            result.setMessage(e.getMessage());
        }catch (MajorNullException e){
            result.setMessage(e.getMessage());
            result.setState(4010);
        }
        return result;
    }

    @RequestMapping("findByClassno")
    public JsonResult<Class> findByClassno(Integer classno){
        JsonResult<Class> result=new JsonResult<>();
        try {
            Class c=classService.findByClassno(classno);
            result.setState(206);
            result.setMessage("查询成功");
            result.setData(c);
        } catch (ClassNullException e) {
            result.setState(4011);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
