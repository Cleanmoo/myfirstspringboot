package com.hut.suaijun.service;


import com.hut.suaijun.bean.Employee;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeByDepId(Integer id);
    List<Employee> getEmployeeByAll();

    void saveEmployee(Integer id,String empName,Integer empAge,Integer deptId);

    void delEmpById(Integer id,String empName,Integer empAge,Integer deptId);

    void editEmpById(Integer id,String empName,Integer empAge,Integer deptId);

}
