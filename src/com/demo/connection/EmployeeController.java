package com.demo.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import junit.framework.TestFailure;

public class EmployeeController {
	
//	Connecton to hibernate.xml and connect to the hibernate database....
	
	public static Session getConnection() {
		
		Configuration con = new AnnotationConfiguration();	//This is configureation of database ..
		con.configure("hibernate.cfg.xml");	//This is hibernate xml file path..
		SessionFactory sf = con.buildSessionFactory();	//this buildSessionFactory we taken xml SessionFactory one method...
		Session ses = sf.openSession();	//Session is open to use every method...
		
		return ses;
		
	}
	
//	Save data into database...
	
	public void saveEmpData(Employee emp) {
		
		System.out.println("Save operation started : "+ emp);

	Session s =	EmployeeController.getConnection();
	
	//Session s = sf.openSession();	//Session connection is open...
	
	Transaction t = s.beginTransaction();	//Transaction is used only while we modify in database...
	
	s.save(emp);	//Session save...
	t.commit();	//Transacton committed in database..
	s.close();	//Session closed..
	
		System.out.println("Save operation Completed : "+ emp);
	
	}
	
	
//	Update Data in database..
	
public void updateData(Employee emp) {
		
		System.out.println("update operation started : "+ emp);

	Session s =	EmployeeController.getConnection();
	
	//Session s = sf.openSession();	//Session connection is open...
	
	Transaction t = s.beginTransaction();	//Transaction is used only while we modify in database...
	
	s.update(emp);	//Session save...
	t.commit();	//Transacton committed in database..
	s.close();	//Session closed..
	
		System.out.println("update operation Completed : "+ emp);
	
	}

//	GetByID..

public void getById(int eid) {
	
	System.out.println("GetById operation started : "+ eid);

	Session s =	EmployeeController.getConnection();
	Employee emp =  (Employee) s.get(Employee.class, eid);
	System.out.println(emp);

	s.close();	//Session closed..
//Session s = sf.openSession();	//Session connection is open...

//Transaction t = s.beginTransaction();	//Transaction is not used 

//s.save(emp);	//Session save...
//t.commit();	//Transacton committed not used in database..


	System.out.println("GetById operation Completed : "+ eid);

}


//	DeleteById operstion..

public void deletById(int eid) {
	
	System.out.println("deleteById operation started : "+ eid);

	Session s =	EmployeeController.getConnection();
	Transaction t = s.beginTransaction();
	Employee emp =  (Employee) s.get(Employee.class, eid);
	
	s.delete(emp);
	t.commit();

	s.close();	//Session closed..
//Session s = sf.openSession();	//Session connection is open...

//Transaction t = s.beginTransaction();	//Transaction is not used 

//s.save(emp);	//Session save...
//t.commit();	//Transacton committed not used in database..


	System.out.println("deleteById operation Completed : "+ eid);

}

}
