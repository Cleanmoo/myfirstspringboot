package com.hut.suaijun.bean;

public class Employee implements java.io.Serializable {
	private Integer id;
	private String empName;
	private Integer empAge;
	
	// 因为外键指向的是主表中的一条数据
	// java中，表中的一条数据就是一个对象
	// 对象
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
}
