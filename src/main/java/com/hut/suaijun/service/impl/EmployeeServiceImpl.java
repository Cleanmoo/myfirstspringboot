package com.hut.suaijun.service.impl;

import com.hut.suaijun.bean.Employee;
import com.hut.suaijun.dao.EmployeeMapper;
import com.hut.suaijun.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployeeByDepId(Integer id) {
        return employeeMapper.getEmployeeByDepId(id);
    }

    @Override
    public List<Employee> getEmployeeByAll() {
        return employeeMapper.getEmployeeByAll();
    }

    @Override
    public void saveEmployee(Integer id, String empName, Integer empAge, Integer deptId) {
        employeeMapper.saveEmployee(id,empName,empAge,deptId);
    }

    @Override
    public void delEmpById(Integer id, String empName, Integer empAge, Integer deptId) {
        employeeMapper.delEmpById(id,empName,empAge,deptId);
    }

    @Override
    public void editEmpById(Integer id, String empName, Integer empAge, Integer deptId) {
        employeeMapper.editEmpById(id, empName, empAge, deptId);
    }
}
