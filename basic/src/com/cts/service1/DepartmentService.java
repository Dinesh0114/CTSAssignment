package com.cts.service1;

import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;

public interface DepartmentService {
public boolean add(Department dept);
public boolean update(Department dept);
public boolean delete(int id);
public Department get(int id);
public List<Department> get();
public void display(Department dept);
public void display();
public List<EmployeeDetails> getEmployees(int empId);
public List<EmployeeDetails> getEmployees(int deptId,int salary);
public List<EmployeeDetails> getEmployees(int deptId,int min,int max);

}
