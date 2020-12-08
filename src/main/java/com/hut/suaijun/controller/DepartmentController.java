package com.hut.suaijun.controller;

import com.hut.suaijun.bean.Department;
import com.hut.suaijun.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DepartmentController {

   @Autowired
    private  DepartmentService departmentService;


    @GetMapping("/toAdd")
    public String toAdd(ModelMap modelMap) {

        List<Department> departments = departmentService.getAllDepartment();

        modelMap.put("departments", departments);

        return "toAdd";
    }

    @GetMapping("/toEdit")
    public String toEdit(ModelMap modelMap) {

        List<Department> departments = departmentService.getAllDepartment();

        modelMap.put("departments", departments);

        return "toEdit";
    }


}
