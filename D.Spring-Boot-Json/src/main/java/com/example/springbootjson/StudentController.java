package com.example.springbootjson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author CodeCoderCoding
 */
@RestController
public class StudentController {
    @GetMapping("/student")
    public Student student(){
        Student student=new Student();
        student.setName("张三");
        student.setAge(18);
        student.setGender(true);
        student.setBirthday(new Date());
        return student;
    }
}
