package com.app.example.jpa;

import java.util.List;

import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.dataaccess.orm.JKObjectDataAccessImpl;

public class JPATest {
	public static void main(String[] args) {
		//Create JPA object
		StudentInformation student = new StudentInformation();
		student.setNumber("121212");
		student.setName("Jalal");
		student.setPhone("123456789");
		student.setAvg(90.0);

		//Create JPA dao
		JKObjectDataAccess dao = new JKObjectDataAccessImpl();
		
		//insert the object in the database using JPA/Hibernate implementation
		dao.insert(student);
		int id=student.getId();
		
		//Retrieve list of objects from database using JPA 
		List<StudentInformation> list = dao.getList(StudentInformation.class);
		for (StudentInformation std : list) {
			System.out.println(std);
		}
		
		//Find an object from database using JPA
		StudentInformation std = dao.find(StudentInformation.class, id);
		std.setName("Updated Jalal");
		
		//update record in the databse
		dao.update(std);
		
		//Delete object from database using an IDE
		dao.delete(StudentInformation.class, id);		
	}


}
