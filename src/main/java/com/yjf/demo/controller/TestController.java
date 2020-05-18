package com.yjf.demo.controller;

import com.yjf.demo.entity.TestEntity;
import com.yjf.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
 
    @Autowired
    private TestService testService ;
 
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id){
        System.out.println("id:" + id);
        System.out.println(testService.getById(id).toString());
        return testService.getById(id);
    }
 
}