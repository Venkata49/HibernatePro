package com.miniprojectt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Utility.GetSession;

public class oneToMany {
	
//	Save operation into database..
	
	public void save (person p) {
		Session s = GetSession.getConnection();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
		
	}

	
//	update passport..
	
	public void update(int pid) {
		Session s = GetSession.getConnection();
		Transaction t = s.beginTransaction();
		person se = (person) s.load(person.class, pid);
		
		passport ps = new passport();
		ps.setPassnum("KLH772");
		ps.setPassexp(2043);
				
		se.setPort(ps);		
		
		mobile mo = new mobile();
		mo.setMsim("Airtel");
		mo.setMnumber(89362527389L);
		
		mobile mo1 = new mobile();
		mo.setMsim("jio");
		mo.setMnumber(6378290380L);
		
		mobile mo2 = new mobile();
		mo.setMsim("Voda");
		mo.setMnumber(33245226278L);
		
		List<mobile> mbil = new ArrayList<>();
		mbil.add(mo);
		mbil.add(mo1);
		mbil.add(mo2);

		
	
		se.setMob(mbil);

		s.update(se);
		t.commit();
		s.close();
	}
	
	
	public static void main(String[] args) {

		
		person pson = new person();
		
		pson.setPname("phani");
		pson.setPage(23);
		pson.setPloc("Ananthapur");
		
		
		course c1 = new course();
		c1.setCname("Spring");
		c1.setCfees(30000.00);
		
		course c2 = new course();
		c2.setCname("AWS");
		c2.setCfees(40000.00);
		
		course c3 = new course();
		c3.setCname("Devops");
		c3.setCfees(50000.00);
		

		passport ps = new passport();
		ps.setPassnum("HJK870");
		ps.setPassexp(2032);
		
		
		

		mobile mo = new mobile();
		mo.setMsim("Airtel");
		mo.setMnumber(89362527389L);
		
		mobile mo1 = new mobile();
		mo.setMsim("jio");
		mo.setMnumber(6378290380L);
		
		mobile mo2 = new mobile();
		mo.setMsim("Voda");
		mo.setMnumber(33245226278L);
		
		List<mobile> mbil = new ArrayList<>();
		mbil.add(mo);
		mbil.add(mo1);
		mbil.add(mo2);
		

		
		List<course> co = new ArrayList<>();
		co.add(c1);
		co.add(c2);
		co.add(c3);
		
		
//		pson.setPort(ps);
//		pson.setCours(co);
//		pson.setMob(mbil);

		
		
		
//		pson.setCours(co);
		
		oneToMany on = new oneToMany();
//		on.update(5);
		
		
	}
	
	
	
}
