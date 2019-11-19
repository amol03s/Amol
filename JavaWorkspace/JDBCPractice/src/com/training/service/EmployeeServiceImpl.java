package com.training.service;

import java.util.Scanner;

import com.training.beans.Employee;
import com.training.dao.EmployeeDao;
import com.training.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

		private EmployeeDao eDao;

	public EmployeeServiceImpl() {
			super();
			this.eDao = new EmployeeDaoImpl();
		}



	public int AddNewEmployee(){
		System.out.println("Enter the id");
		Scanner sc =new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		String Name=sc.next();
		Employee e=new Employee(id,Name);
		
		
		return eDao.insertData(e);
	}
	
	
}
