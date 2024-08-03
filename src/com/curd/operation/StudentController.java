package com.curd.operation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.connection.EmployeeController;

public class StudentController {
	
//	Connection Hibernate..
	
	public static Session getConnection() {
		
		Configuration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		
		Session ses  =  sf.openSession();
		return ses;
	}
	
//	Save data ..
	
	public void saveStdData(StudentPOJO std) {
		System.out.println("save operation started....");
		Session ss = StudentController.getConnection();
		Transaction t = ss.beginTransaction();
		
		ss.save(std);
		t.commit();
		ss.close();
		
		System.out.println("save operation closed...");
		
	}
	
//	Update..
	
	public void update(int sid) {
		System.out.println("Update data started..");
		Session s = StudentController.getConnection();
		Transaction t = s.beginTransaction();
	StudentPOJO std =	(StudentPOJO) s.load(StudentPOJO.class, sid);
	std.setScourse("cricket");
	System.out.println(std);
	s.update(std);
	t.commit();
		s.close();
		
		System.out.println("update operation closed..");
		
	}
	
//	Delete...
	
	public void delete(int sid) {
		System.out.println("delete data started..");
		Session s = StudentController.getConnection();
		Transaction t = s.beginTransaction();
	StudentPOJO std =	(StudentPOJO) s.load(StudentPOJO.class, sid);
	System.out.println(std);
	s.delete(std);
	t.commit();
		s.close();
		
		System.out.println("delete operation closed..");
		
	}
	
//	GetById...
	
	public void getbyid(int sid) {
		System.out.println("getbyid operation is started..");
		Session s = StudentController.getConnection();
		StudentPOJO sp = (StudentPOJO) s.load(StudentPOJO.class, sid);
		
		System.out.println(sp);
		s.close();
		System.out.println("getbyid operation completed..");
		
	}
	
//	GetAll..
	
	public void getAll() {
		System.out.println("getAll operation is started..");
		Session s = StudentController.getConnection();
		
//		This is Hql query ... hql query must need to start Query first 'Query sp = s.createQuery("from StudentPOJO");'
		
		Query q = s.createQuery("from StudentPOJO"); 	//Here need all data in StudentPOJO so we taken Object
		List<StudentPOJO> li = q.list();
		for(StudentPOJO d : li) {
			System.out.println(d);
			
		}
		s.close();
		System.out.println("getAll operation is completed..");

	}
	
//	specially we need selected columns so use Object[]...
	
	public void getByRequiredColumns() {
		
		System.out.println("getbyid operation is started..");
		Session s = StudentController.getConnection();

//		This query based on column reference..
		
//		Query q = s.createQuery("select sname, scourse, smarks from StudentPOJO ");	// here they corverted array[] Object because we need selected columns...
		
//		This Query based on where condition...
		
		Query q = s.createQuery("select sname, scourse, smarks from StudentPOJO where sid =3");//here we perform <,>,<=,>=,=,!=,and,or,between operations..
		
		
		List<Object[]> or = q.list();
//		Loop..
		
		for(Object[] o : or) {
			System.out.println(o[0]+"---"+o[1]+"---"+o[2]);
		}
		

		s.close();
		System.out.println("getbyid operation completed..");
		
	}
	
//	Based on requrement update the row specially column .... Dynamic way.... (:name)...
	
	public void getByNameRequiredRowName(String sname) {
		
		Session s = StudentController.getConnection();

		Query q = s.createQuery("select sname, scourse, sage from StudentPOJO where sname = :name");
		q.setParameter("name", sname);
		
		List<Object[]> ob = q.list();
		
		for(Object[] d : ob) {
			System.out.println(d[0]+"---"+d[1]+"---"+d[2]);
		}
	}
	
//	Update Dynamic way...
	
	public void updateDynamic(double smarks,String scourse,String sname) {
		
		System.out.println("Update data started..");
		Session s = StudentController.getConnection();
		Transaction t = s.beginTransaction();
		
//		String sq = ;
		Query q = s.createQuery("update StudentPOJO set smarks = :mark,scourse = :course where sname =:name");
		
//		Update the values by sname reference...
		
		q.setParameter("mark", smarks);	
		q.setParameter("course", scourse);
		q.setParameter("name", sname);

		q.executeUpdate(); 	//Execute the query must need this...
		
		
		t.commit();
		s.close();
		
		System.out.println("update operation closed..");
		
	}

}
