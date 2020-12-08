package com.hut.suaijun.dao;

import com.hut.suaijun.bean.Department;
import com.hut.suaijun.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    List<Department> getAllDepartment();
}
