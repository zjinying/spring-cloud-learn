package com.pear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjy on 2018/3/2.
 */
@RestController
public class Controller {

    @Value("${myww}")
    private String myww;

    @RequestMapping(value = "/hi")
    public String hi(){
        return myww;
    }
}
