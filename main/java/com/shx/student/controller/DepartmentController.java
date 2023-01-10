package com.shx.student.controller;

import com.shx.student.pojo.Department;
import com.shx.student.service.IDepartmentService;
import com.shx.student.service.ex.DepartmentDnoDuplicationException;
import com.shx.student.service.ex.DepartmentFindNullException;
import com.shx.student.service.ex.DepartmentInsertException;
import com.shx.student.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;
    @RequestMapping("addDepartment")
    public JsonResult<Void> addDepartment(Department department){
        JsonResult<Void> result=new JsonResult<>();
        try {
            departmentService.insert(department);
            result.setState(202);
            result.setMessage("系数据添加成功");
        } catch (DepartmentDnoDuplicationException e) {
            result.setState(4003);
            result.setMessage(e.getMessage());
        } catch (DepartmentInsertException e){
            result.setState(4004);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @RequestMapping("findAll")
    public JsonResult<List> findAll(){
        JsonResult<List> result=new JsonResult<>();
        try {
            List<Department>list=departmentService.findAllDepartment();
            result.setState(203);
            result.setMessage("查询成功");
            result.setData(list);
        } catch (DepartmentFindNullException e) {
            result.setState(4005);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @RequestMapping("findByDno")
    public  JsonResult<Department> findByDno(Integer dno) {
        JsonResult<Department> jsonResult = new JsonResult<>();
        try {
            Department department = departmentService.findByDno(dno);
            jsonResult.setState(204);
            jsonResult.setMessage("查询成功");
            jsonResult.setData(department);
        } catch (DepartmentFindNullException e) {
            jsonResult.setState(4005);
            jsonResult.setMessage(e.getMessage());
        }
        return jsonResult;
    }
}
