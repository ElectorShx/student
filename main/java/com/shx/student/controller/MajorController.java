package com.shx.student.controller;

import com.shx.student.pojo.Major;
import com.shx.student.service.IMajorService;
import com.shx.student.service.ex.DepartmentFindNullException;
import com.shx.student.service.ex.MajorDuplicationException;
import com.shx.student.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("major")
public class MajorController {
    @Autowired
    private IMajorService majorService;
    @RequestMapping("addMajor")
    public JsonResult<Void> insert(Major major){
        JsonResult<Void> result=new JsonResult<>();
        try {
            majorService.insert(major);
            result.setState(204);
            result.setMessage("插入成功");

        }catch (MajorDuplicationException e){
            result.setState(4006);
            result.setMessage(e.getMessage());
        }catch (DepartmentFindNullException e){
            result.setState(4007);
            result.setMessage(e.getMessage());
        }
        return result;
    }

}
