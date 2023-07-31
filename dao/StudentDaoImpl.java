package com.dao;

import java.util.*;

public class StudentDaoImpl implements StudentDao {

	List<Student> stud;
	public StudentDaoImpl()
	{
		stud = new ArrayList<Student>();
		Student s1 = new Student(1,"Robert");
		Student s2 = new Student(2,"John");
		stud.add(s1);
		stud.add(s2);
	}
	
	@Override
	public List<Student> getallstudents() {
		return stud;
	}

	@Override
	public Student getstudent(int rollno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletestudent(Student stud) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatestudent(Student stud) {
		// TODO Auto-generated method stub
		
	}

}
