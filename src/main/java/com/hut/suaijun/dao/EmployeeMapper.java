package com.hut.suaijun.dao;

import com.hut.suaijun.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {


    List<Employee> getEmployeeByDepId(Integer id);
    List<Employee> getEmployeeByAll();

    void saveEmployee(
            @Param("id")Integer id,
            @Param("empName")String empName,
            @Param("empAge")Integer empAge,
            @Param("deptId")Integer deptId);

    void delEmpById(
            @Param("id") Integer id,
            @Param("empName") String empName,
            @Param("empAge")Integer empAge,
            @Param("depId")Integer deptId
            );

    void editEmpById(
            @Param("id")Integer id,
            @Param("empName")String empName,
            @Param("empAge") Integer empAge,
            @Param("deptId")Integer deptId
    );

}
