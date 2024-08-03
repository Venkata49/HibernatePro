package com.miniprojectt;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Utility.GetSession;

public class CriteriaOperation {

	public static void main(String[] args) {

		Session s = GetSession.getConnection();
//		Criteria cr = s.createCriteria(person.class);
//		cr.add(Restrictions.eq("pname", "Sreeni"));
//		cr.add(Restrictions.like("pname","%i"));
//		cr.add(Restrictions.gt("page",23));	//GreaterThan page > 23
//		cr.add(Restrictions.lt("page",23));	//LessThan page < 23
//		cr.add(Restrictions.between("page",21,24));
//		
//		String[]  si= {"Sreeni","Ajay","Komal"};
//
//		cr.add(Restrictions.in("pname",si));
		
//		Passport operation...
		
		Criteria cr = s.createCriteria(person.class,"p");
		
		cr.createAlias("p.port", "pt");
//		cr.add(Restrictions.eq("pt.passnum","DFG672"));
//		cr.add(Restrictions.eq("pt.passexp",2032));
		
//		Mobile operation...
		
//		cr.createAlias("p.mob", "mo");
//		cr.add(Restrictions.eq("mo.msim","docomo"));

		
//		Course Opeartion..
		
		
		
		cr.createAlias("p.cours", "cs");
		cr.add(Restrictions.eq("cs.cname","Oracle"));

		
		
		
		
		List<person> per = cr.list();
		for(person n : per) {
			System.out.println(n);
		}
	}

}
