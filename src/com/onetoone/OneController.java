package com.onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.curd.operation.StudentPOJO;
import com.pojo.Passport;
import com.pojo.Person;

import Utility.GetSession;

public class OneController {

	public void save(Person p) {	 //Person was import com.pojo package..
		Session s = GetSession.getConnection();	//Session was importing GetSession class in Utility package...
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
		
	}
	
	public void getById(int pid) {	 //Person was importing com.pojo package..
		Session s = GetSession.getConnection();	//Session was importing GetSession class in Utility package...
		Person p = (Person) s.get(Person.class, pid);
		System.out.println(p);
		s.close();
		
	}

//	GetAll...
	
	public void getAll() {	 //Person was importing com.pojo package..
		Session s = GetSession.getConnection();	//Session was importing GetSession class in Utility package...
		Query q = s.createQuery("from Person p");
		List<Person> per = q.list();
		for(Person p : per) {
			System.out.println(p);
		}
		s.close();
		
	}
	
//	Using getByid update data base...
	
	public void getByIdUpdate(int pid) {	 //Person was importing com.pojo package..
		Session s = GetSession.getConnection();	//Session was importing GetSession class in Utility package...
		Transaction t = s.beginTransaction();
		Person p =	(Person) s.get(Person.class, pid);

		p.setPname("Kholi");
			
		s.update(p);
		t.commit();
		s.close();
		
	}
	
	
//	Using getByid delete data base ...
	
	public void getAll1() {	 //Person was importing com.pojo package..
		Session s = GetSession.getConnection();	//Session was importing GetSession class in Utility package...
		Query q = s.createQuery("from Person p");
		List<Person> per = q.list();
		for(Person p : per) {
			System.out.println(p);
		}
		s.close();
		
	}
	public static void main(String[] args) {
		
		OneController oc = new OneController();
		/*Person p = new Person();
		p.setPname("karim");
		p.setPage(26);
		p.setPloc("Jmd");
		
		Passport ps = new Passport();
		ps.setPassum("WES434");
		ps.setPassexp(2030);
		
		p.setPass(ps);
		oc.save(p);*/
		
//		oc.getById(1);
		
//		oc.getAll();
		oc.getByIdUpdate(1);

	}

}
