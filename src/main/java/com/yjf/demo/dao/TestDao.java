package com.yjf.demo.dao;

import com.yjf.demo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
 
@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}