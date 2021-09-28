package com.supremepole.springbootmybatis.controller;

import com.supremepole.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public void studentController(){

    }
}
