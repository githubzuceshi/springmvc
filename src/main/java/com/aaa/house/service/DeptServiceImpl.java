package com.aaa.house.service;

import com.aaa.house.dao.DeptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements  DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Map> getList() {
        return deptDao.getList();
    }

    @Override
    public Map getById(int deptno) {
     List<Map>  mapList= deptDao.getById(deptno);
     if (mapList!=null && mapList.size()>0){
         return  mapList.get(0);
     }
        return null;
    }
}
