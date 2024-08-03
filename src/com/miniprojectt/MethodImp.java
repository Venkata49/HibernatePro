package com.miniprojectt;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.miniprojectt.person;
import com.pojo.Person;

import Utility.GetSession;

public class MethodImp {

		
//		Save operation into database..
		
		public void save (person p) {
			Session s = GetSession.getConnection();
			Transaction t = s.beginTransaction();
			s.save(p);
			t.commit();
			s.close();
			
		}
		
//		update passport to person..
		
		public void update(int pid) {
			Session s = GetSession.getConnection();
			Transaction t = s.beginTransaction();
			person se = (person) s.load(person.class, pid);
			
			passport ps = new passport();
			ps.setPassnum("NDH980");
			ps.setPassexp(2040);
			
			se.setPort(ps);
			
			s.update(se);
			t.commit();
			s.close();
		}

//		Update mobiles to person...
	
		public void updateMob(int pid) {
			Session s = GetSession.getConnection();
			Transaction t = s.beginTransaction();
			person se = (person) s.load(person.class, pid);
			
			mobile mo = new mobile();
			mo.setMsim("DOCOMO");
			mo.setMnumber(9848022683L);
			
			List<mobile> m = new ArrayList<>();
			m.add(mo);
			
			se.setMob(m);
			
			s.update(se);
			t.commit();
			s.close();
		}

//		Delete operation in person and mobile pid = 3..
		
		public void deletePerson(int pid) {
			
			Session s = GetSession.getConnection();
			Transaction t = s.beginTransaction();
			person se = (person) s.load(person.class, pid);
				
						
			s.delete(se);
			t.commit();
			s.close();
			
			
		}
		
		
//		get all data in database..

		public void getById() {
			
			Session s = GetSession.getConnection();

			Query q = s.createQuery(" from person where pid =1");
			
			List<person> per = q.list();
			for(person p : per) {
				System.out.println(p);
			}
						
			s.close();
			
			
		}

	
	public void getAll() {
		
		Session s = GetSession.getConnection();

		Query q = s.createQuery("from person");
		
		List<person> per = q.list();
		for(person p : per) {
			System.out.println(p);
		}
					
		s.close();
		
		
	}
		
	
	

	

}
