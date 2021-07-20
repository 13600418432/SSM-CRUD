package com.zqx.controller;

import com.zqx.pojo.Department;
import com.zqx.pojo.Msg;
import com.zqx.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @ResponseBody
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public Msg getDept(){
        List<Department> depts = departmentService.getDepts();
        return Msg.success().add("depts",depts);
    }

}
