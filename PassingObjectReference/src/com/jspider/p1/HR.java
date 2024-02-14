package com.jspider.p1;

public class HR {
	
	void hike(Employee emp,double hikeAmount) {
		System.out.println("Increasing Salary Of "+emp.getName());
		emp.setSalary(emp.getSalary()+hikeAmount);
	}
}
