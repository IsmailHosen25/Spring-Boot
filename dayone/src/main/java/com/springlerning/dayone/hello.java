package com.springlerning.dayone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {


    @GetMapping("/hello")
    public String hello(){
      return ("hello  hasan");
    }


    @Autowired
    private car car;

    @GetMapping("/iocdi")
    public String iocdi(){
       return car.name();
    }


}
