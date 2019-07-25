package com.aaa.house.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DeptDao {

    /**
     * 查询列表
     * @return
     */
    @Select("select * from dept")
    List<Map> getList();


    /**
     * 根据id获取对象
     * @param deptno
     * @return
     */
    @Select("select * from dept where deptno =#{deptno}")
    List<Map> getById(int deptno);
}
