package com.jarluo.dockerall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 通过Dockerfile定义自己的image
 * @author jarluo
 * @time 2019.11.8
 */
@RestController
public class DockerController {
    @GetMapping("/dockerfile")
    @ResponseBody
    String  Dockerfile(){
        return "Hello Dockerfile";
    }
}
