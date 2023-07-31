package com.dao;

public class DaoDemo {

	public static void main(String[] args) {
		StudentDaoImpl d = new StudentDaoImpl();
		
		for(Student s : d.getallstudents())
		{
			System.out.println("Rollno : "+s.getRollno());
			System.out.println("Name : "+s.getName());
		}

	}

}
