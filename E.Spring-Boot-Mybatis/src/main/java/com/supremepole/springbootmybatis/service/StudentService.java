package com.supremepole.springbootmybatis.service;

import com.supremepole.springbootmybatis.mapper.StudentMapper;
import com.supremepole.springbootmybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper bookMapper;
    public int addStudent(Student student) {
        return bookMapper.addStudent(student);
    }
    public int updateStudent(Student student) {
        return bookMapper.updateStudentById(student);
    }
    public int deleteStudentById(Integer id) {
        return bookMapper.deleteStudentById(id);
    }
    public Student getStudentById(Integer id) {
        return bookMapper.getStudentById(id);
    }
    public List<Student> getAllStudents() {
        return bookMapper.getAllStudents();
    }
}
