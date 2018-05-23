package com.cts.service1;

import java.util.List;

import com.cts.bean.EmployeeDetails;

public interface EmployeeDetailService {
public boolean add(EmployeeDetails emp);
public boolean update(EmployeeDetails emp);
public boolean delete(int id);
public EmployeeDetails get(int id);

public List<EmployeeDetails> get();
public void display(EmployeeDetails emp);
public void display();




}
