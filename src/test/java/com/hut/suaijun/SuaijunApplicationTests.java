package com.hut.suaijun;

import com.hut.suaijun.dao.DepartmentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SuaijunApplicationTests {

    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    void contextLoads() {
        System.out.println(departmentMapper.getAllDepartment());
    }

}
