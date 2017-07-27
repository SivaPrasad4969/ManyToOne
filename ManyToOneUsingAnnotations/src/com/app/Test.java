package com.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Vendor v=new Vendor();
		v.setVid(102);
		v.setVname("krishna");
       
		
		System.out.println("hello github");
		Customers c=new Customers();
		c.setCid(21);
		c.setCname("raju");
		c.setVendor(v);
		
		Customers c1=new Customers();
		c1.setCid(22);
		c1.setCname("hari");
		c1.setVendor(v);
		
		session.save(c);
		session.save(c1);
		
		t.commit();
		session.close();
		factory.close();
	}

}
