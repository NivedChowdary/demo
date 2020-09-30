package com.cp.bootcamp.ctr;

import java.util.Scanner;

import com.cp.bootcamp.bean.Employee;

public class EmployeeOperations {
	Employee arr[] = new Employee[100];
	static int index = 0;
	
	public boolean addEmployee(Employee e)
	{
		arr[index++] = e;
		return true;
	}
	public static int getIndex() {
		return index;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e = null;
		for (int i = 0; i < index; i++) {
			if(arr[i].getCode() == id)
			{
				return arr[i];
			}
		}
		return e;
	}
	
	public Employee updateSalary(String project,int percentage) {
		
		
		for (int i = 0; i < index; i++) {
			if(arr[i].getProject().equals(project))
			{
				int x = arr[i].getSalary();
				x += (x*percentage/100);
				arr[i].setSalary(x);
			}
		}
		
		return null;
		
		
	}

	public Employee[] displayAllEmployeeso() {
		
		return arr;
		
	}
}
