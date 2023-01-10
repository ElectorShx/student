package com.shx.student.controller;

import com.shx.student.pojo.Class;
import com.shx.student.pojo.Student;
import com.shx.student.service.IStudentService;
import com.shx.student.service.ex.*;
import com.shx.student.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @RequestMapping("insert")
    public JsonResult<Void> insert(Student student){
        JsonResult<Void> result =new JsonResult<>();
        try {
            studentService.insert(student);
            result.setState(207);
            result.setMessage("添加成功");
        } catch (StudentDuplicationException e) {
            result.setState(4012);
            result.setMessage(e.getMessage());
        }catch (ClassNullException e){
            result.setState(4013);
            result.setMessage(e.getMessage());
        }catch (StudentInsertException e){
            result.setMessage(e.getMessage());
            result.setState(4014);
        }
        return result;
    }
    @RequestMapping("findBySno")
    public JsonResult<Student> findBySno(Integer sno){
        JsonResult<Student> result=new JsonResult<>();
        try {
            Student student=studentService.findBySno(sno);
            result.setState(208);
            result.setMessage("查询成功");
            result.setData(student);
        } catch (StudentNullException e) {
            result.setState(4015);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
