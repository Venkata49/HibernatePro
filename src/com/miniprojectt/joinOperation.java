package com.miniprojectt;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Utility.GetSession;

public class joinOperation {

	public void get() {
		
		Session s = GetSession.getConnection();

//		person to passport query...
//		Query q = s.createQuery(" select p.pname, p.page, p.ploc, pt.passnum, pt.passexp from person p  inner join p.port pt where p.pname = 'Ajay'");
		
//		person to mobile query...
		
//		Query q = s.createQuery(" select p.pname, p.page, p.ploc, mo.msim, mo.mnumber from person p  inner join p.mob mo where p.pname = 'Ajay'");

//		person ,passport,mobile,course....
		
		Query q = s.createQuery(" select p.pname, p.page, p.ploc, pt.passnum, pt.passexp, mo.msim, mo.mnumber, pc.cname, pc.cfees from person p  inner join p.port pt inner join  p.mob mo inner join p.cours pc where p.pname = 'Ajay'");
//		q.setFirstResult(5);
		q.setMaxResults(1);
		List<Object[]> per = q.list();
		for(Object[] p : per) {
			
			System.out.println(p[0]+"----"+p[1]+"----"+p[2]+"----"+p[3]+"----"+p[4]+"----"+p[5]+"----"+p[6]+"----"+p[7]+"----"+p[8]);
		}
					
		s.close();
		
		
	}
	public static void main(String[] args) {
		joinOperation j = new joinOperation();
		j.get();

	}

}
