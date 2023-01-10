package com.shx.student.controller;

import com.shx.student.pojo.Clud;
import com.shx.student.service.ICludService;
import com.shx.student.service.ex.CludFindNullException;
import com.shx.student.service.ex.CludInsertException;
import com.shx.student.service.ex.CludnoDuplicationException;
import com.shx.student.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clud")
public class CludController {
    @Autowired
    private ICludService cludService;
    @RequestMapping("addclud")
    public JsonResult<Void> addClud(Clud clud){
        JsonResult<Void> result =new JsonResult<>();
        try {
            cludService.addClud(clud);
            result.setState(200);
            result.setMessage("添加成功");
        } catch (CludInsertException e) {
            result.setState(4000);
            result.setMessage("插入过程中出现未知错误");
        }catch (CludnoDuplicationException e){
            result.setState(4001);
            result.setMessage("该学会已存在");
        }
        return result;
    }
    @RequestMapping("findallclud")
    public JsonResult<List> findAll(){
        JsonResult<List> result =new JsonResult<>();
        try {
            List<Clud> list =cludService.findCludAll();
            result.setData(list);
            result.setState(201);
            result.setMessage("查询成功");
        }catch(CludFindNullException e){
            result.setState(4002);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
