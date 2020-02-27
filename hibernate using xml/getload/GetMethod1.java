package com.hibernate.getload;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernate.Employee1;

import org.hibernate.Session;

public class GetMethod1 
{
	public static void main(String[] args) 
	{
		Configuration cf=new AnnotationConfiguration();
		cf.configure("com/hibernate/getload/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ses=sf.openSession();
	
				Transaction tr=ses.beginTransaction();
				System.out.println("start");
		    Employee2 e  = (Employee2)ses.get(Employee2.class,3);
		   System.out.println("fetch");
		   System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteAddr());
		   System.out.println("end");		
		System.out.println("done");
		
		
	}
	

}
