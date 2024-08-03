package com.miniprojectt;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Utility.GetSession;

public class ProjectionsOperation {

	public static void main(String[] args) {

//		Projections only used to print specified column names...
		
		Session s = GetSession.getConnection();
			Criteria cr = s.createCriteria(person.class, "p");
			cr.createAlias("p.port", "pt");
//			cr.createAlias("p.mob", "mo");
//			cr.createAlias("p.cours", "cs");
			
			Projection pro = Projections.property("pt.passnum");
			cr.setProjection(pro);
			cr.add(Restrictions.eq("pname","Ajay"));
			
			List j = cr.list();
			System.out.println(j);
			
			/*
			 * ProjectionList p1 = Projections.projectionList(); //
			 * p1.add(Projections.max("p.page"));
			 * 
			 * p1.add(Projections.property("p.pname"));
			 * p1.add(Projections.property("p.page"));
			 * p1.add(Projections.property("p.ploc"));
			 * p1.add(Projections.property("pt.passnum"));
			 * p1.add(Projections.property("pt.passexp"));
			 * p1.add(Projections.property("mo.msim"));
			 * 
			 * p1.add(Projections.property("mo.mnumber"));
			 * p1.add(Projections.property("cs.cname"));
			 * 
			 * p1.add(Projections.property("cs.cfees"));
			 * 
			 * 
			 * 
			 * cr.setProjection(p1); cr.add(Restrictions.eq("pname", "Phani"));
			 * 
			 * List<Object[]> data = cr.list(); for(Object[] n : data) {
			 * System.out.println(n[0]+"---"+n[1]+"---"+n[2]+"---"+n[3]+"---"+n[4]+"---"+n[5
			 * ]+"---"+n[6]+"---"+n[7]+"---"+n[8]); }
			 */
			
			
			
	}

}
