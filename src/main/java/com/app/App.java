package com.app;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccessImpl;
import com.jk.db.datasource.JKDataAccessFactory;

public class App {
	public static void main(String[] args) {
		//Create Object dao
		JKObjectDataAccess dao = JKDataAccessFactory.getObjectDataAccess();

		//Create JPA object
		Student student = new Student();
		student.setNumber("121212");
		student.setName("Jalal");
		student.setPhone("123456789");
		student.setAvg(90.0);
		
		//insert the object in the database using JPA/Hibernate implementation
		dao.insert(student);
		int id=student.getId();
		
		//Retrieve list of objects from database using JPA 
		List<Student> list = dao.getList(Student.class);
		for (Student std : list) {
			System.out.println(std);
		}
		
		//Find an object from database using JPA
		Student std = dao.find(Student.class, id);
		std.setName("Updated Jalal");
		
		//update record in the databse
		dao.update(std);
		
		//Delete object from database using an IDE
		dao.delete(Student.class, id);		
	}


}
