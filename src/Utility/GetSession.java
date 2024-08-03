package Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class GetSession {
	
	
//	Connection Hibernate..
	
	public static Session getConnection() {
		
		Configuration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		
		Session ses  =  sf.openSession();
		return ses;
	}
	

}
