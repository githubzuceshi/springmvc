package com.aaa.house.controller;

import com.aaa.house.service.DeptService;
import com.aaa.house.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private EmpService empService;
    /**
     * 员工列表
     * @return
     */
    @RequestMapping("deptlist")
    public  Object list(){
        return  deptService.getList();
    }

    @RequestMapping("deptById")
    public  Object getDept(Integer deptno){
        Map dept= deptService.getById(deptno);
        dept.put("emplist",empService.getEmpList());
        return dept ;
    }
}
