package com.supremepole.springbootmybatis.mapper;

import com.supremepole.springbootmybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Mapper
public interface StudentMapper {
    int addStudent(Student student);
    int deleteStudentById(Integer id);
    int updateStudentById(Student student);
    Student getStudentById(Integer id);
    List<Student> getAllStudents();
}
