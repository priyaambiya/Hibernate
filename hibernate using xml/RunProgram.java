package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunProgram 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Employee1 e1=new Employee1(120,"priya","indore");
				Transaction tr=ses.beginTransaction();
		ses.save(e1);
		tr.commit();
		ses.close();
		System.out.println("done");
		
		
	}

}
