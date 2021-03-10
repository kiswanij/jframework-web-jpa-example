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
		Account account = new Account();
		account.setNumber("121212");
		account.setName("Jalal");
		account.setPhone("123456789");
		account.setAvg(90.0);
		
		//insert the object in the database using JPA/Hibernate implementation
		dao.insert(account);
		int id=account.getId();
		
		//Retrieve list of objects from database using JPA 
		List<Account> list = dao.getList(Account.class);
		for (Account std : list) {
			System.out.println(std);
		}
		
		//Find an object from database using JPA
		Account std = dao.find(Account.class, id);
		std.setName("Updated Jalal");
		
		//update record in the databse
		dao.update(std);
		
		//Delete object from database using an IDE
		dao.delete(Account.class, id);		
	}


}
