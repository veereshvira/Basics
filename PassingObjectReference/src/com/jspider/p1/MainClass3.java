package com.jspider.p1;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR hr1 = new HR();
		Employee e1 = new Employee("Ramesh",2012,45000);
		System.out.println("Salary before hike:"+e1.getSalary());
		hr1.hike(e1, 20000.00);
		System.out.println("Salary After hike:"+e1.getSalary());
	}

}
