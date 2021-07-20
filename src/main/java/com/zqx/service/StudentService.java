package com.zqx.service;

import com.zqx.dao.StudentDao;
import com.zqx.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student test(Integer id){
        Student student = studentDao.getStudent(id);
        return student;
    }
}
