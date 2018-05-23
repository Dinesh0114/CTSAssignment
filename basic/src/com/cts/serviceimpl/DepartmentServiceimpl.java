 package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.Department;
import com.cts.bean.EmployeeDetails;
import com.cts.service1.DepartmentService;

public class DepartmentServiceimpl implements DepartmentService {
	private ArrayList<Department> dept1 = new ArrayList<Department>();

	@Override
	public boolean add(Department dept) {
		if (get(dept.getId()) == null) {
			return false;
		}
		dept1.add(dept);
		return true;
	}

	@Override
	public boolean update(Department dept) {
		if (get(dept.getId()) == null) {
			return false;
		}
		dept1.add(dept);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(int id) {
		if (get(id) != null) {
			dept1.remove(id);
		}

		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Department get(int id) {
		for (Department dept : dept1) {
			if (dept.getId() == id) {
				return dept;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> get() {
		
			return dept1;
		
	}

	@Override
	public void display(Department dept) {
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeDetails> getEmployees(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDetails> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

}
