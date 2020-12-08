package com.hut.suaijun.service.impl;

import com.hut.suaijun.bean.Department;
import com.hut.suaijun.dao.DepartmentMapper;
import com.hut.suaijun.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartment(){

        return departmentMapper.getAllDepartment();

    }


}
