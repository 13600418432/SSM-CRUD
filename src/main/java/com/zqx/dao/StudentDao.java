package com.zqx.dao;

import com.zqx.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    //给参数指定一个key
    Student getStudent(@Param("id")Integer id);
}
