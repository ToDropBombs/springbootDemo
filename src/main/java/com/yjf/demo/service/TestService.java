package com.yjf.demo.service;

import com.yjf.demo.dao.TestDao;
import com.yjf.demo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
 
    @Autowired
    private TestDao testDao ;
 
    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
