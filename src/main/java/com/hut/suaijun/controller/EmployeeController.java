package com.hut.suaijun.controller;

import com.hut.suaijun.bean.Department;
import com.hut.suaijun.bean.Employee;
import com.hut.suaijun.service.DepartmentService;
import com.hut.suaijun.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;



//根据部门ID查询员工信息
    @GetMapping("/queryEmpByDeptId")
    public String queryEmpByDeptId(ModelMap modelMap,Integer  id){ //有多个参数的可以设置

        if(id==null){
            List<Employee> employees=employeeService.getEmployeeByAll();
            modelMap.put("employees",employees);
        }else {
            List<Employee> employees=employeeService.getEmployeeByDepId(id);
            modelMap.put("employees",employees);
        }

        modelMap.put("deptId",id);  //这行代码的意思是什么？？？

        //部门信息也要发过去
        List<Department> departments=departmentService.getAllDepartment();
        modelMap.put("departments",departments);

        return "admin";
    }

    //添加员工信息（添加时指定员工所属部门）
    @GetMapping("/saveEmployee")
    public String saveEmployee(ModelMap modelMap,Integer id,String empName,Integer empAge,Integer deptId){
        employeeService.saveEmployee(id,empName,empAge,deptId);

        List<Department> departments=departmentService.getAllDepartment();
        modelMap.put("departments",departments);

        return "admin";
    }

    //根据员工id删除员工信息
    @GetMapping("delEmpById")
    public String delEmpById(ModelMap modelMap,Integer id,String empName,Integer empAge,Integer deptId){
        employeeService.delEmpById(id, empName, empAge, deptId);

        List<Department> departments=departmentService.getAllDepartment();
        modelMap.put("departments",departments);

        return "admin";
    }

    //根据员工id编辑员工信息
    @GetMapping("/editEmpById")
    public String editEmpById(ModelMap modelMap,Integer id,String empName,Integer empAge,Integer deptId){
        employeeService.editEmpById(id, empName, empAge, deptId);

        List<Department> departments=departmentService.getAllDepartment();
        modelMap.put("departments",departments);

        return "admin";
    }

}
