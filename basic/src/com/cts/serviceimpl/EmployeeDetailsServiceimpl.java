package com.cts.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.EmployeeDetails;
import com.cts.service1.EmployeeDetailService;

public class EmployeeDetailsServiceimpl implements EmployeeDetailService {

	private ArrayList<EmployeeDetails> emp1 = new ArrayList<EmployeeDetails>();

	@Override
	public boolean add(EmployeeDetails emp) {
		if (get(emp.getId()) != null) {
			return false;
		}
		emp1.add(emp);

		return true;
	}

	@Override
	public boolean update(EmployeeDetails emp) {
		if (get(emp.getId()) == null) {
			return false;
		}

		emp1.remove(emp.getId());
		emp1.add(emp);

		return true;
	}

	@Override
	public boolean delete(int id) {
		EmployeeDetails emp2 = get(id);
		if (emp2 != null) {
			emp1.remove(id);
		}

		return true;
	}

	@Override
	public EmployeeDetails get(int id) {
		for (EmployeeDetails emp : emp1) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public List<EmployeeDetails> get() {
		return emp1;
		// TODO Auto-generated method stub

	}

	@Override
	public void display(EmployeeDetails emp) {

		{

			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());

		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (EmployeeDetails emp : emp1) {
			display(emp);
		}

	}

}
