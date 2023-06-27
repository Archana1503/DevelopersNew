////writre getter setter method for class variable class employee ..{private int id; private Boolean ismanager privTE FLOAT SALLery ;department dept;
////add getter setter for employee.
//
package com.assignment3;
//


public class Employeegtrstr {
	private int id;
	private Boolean isManager;
	private float salary;
	private Department dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employeegtrstr employee = new Employeegtrstr();
		employee.setId(1);
		employee.setIsManager(true);
		employee.setSalary(5000.0f);
		Department department = new Department();
		department.setName("HR");
		employee.setDept(department);

		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Is Manager: " + employee.getIsManager());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Department: " + employee.getDept().getName());
	}
}

class Department {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
