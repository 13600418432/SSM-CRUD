package com.zqx.test;

import com.zqx.dao.DepartmentMapper;
import com.zqx.dao.EmployeeMapper;
import com.zqx.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void testCRUD(){
        Department department = departmentMapper.selectByPrimaryKey(1);
        System.out.println(department);
        //employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@zqx.com",1));
//        EmployeeMapper mapper = sqlSessionTemplate.getMapper(EmployeeMapper.class);
//        for (int i = 0; i < 1000; i++) {
//            String uid = UUID.randomUUID().toString().substring(0, 5)+i;
//            mapper.insertSelective(new Employee(null,uid,"M",uid+"@zqx.com",1));
//        }
    }

}
