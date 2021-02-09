package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }
@PostMapping("/number")
    public String addnum(@RequestParm (value = " number1") int number1,@ReuqestParm (value = " number2") int number2) {
        return (number1+number2);
    }
}
