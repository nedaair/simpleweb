package org.nedaair.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nedaair on 2017. 1. 26..
 */
@Controller
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);


    {
        logger.info("18");
    }

    @RequestMapping("/register")
    public String register(){
        logger.info("test");
        return "index";
    }
}
