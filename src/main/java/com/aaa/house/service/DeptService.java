package com.aaa.house.service;

import java.util.List;
import java.util.Map;

public interface DeptService {

    /**
     * 查询列表
     * @return
     */
    List<Map> getList();


    /**
     * 根据id获取对象
     * @param deptno
     * @return
     */
    Map getById(int deptno);

}
