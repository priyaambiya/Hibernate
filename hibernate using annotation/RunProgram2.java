package com.hibernateannotation;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernate.Employee1;

import org.hibernate.Session;

public class RunProgram2 
{
	public static void main(String[] args) 
	{
		Configuration cf=new AnnotationConfiguration();
		cf.configure("com/hibernateannotation/hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session ses=sf.openSession();
	
				Transaction tr=ses.beginTransaction();
				Employee2 e1=new Employee2();
				//e1.seteId(999);
				e1.seteName("taaanaaay");
				e1.seteAddr("iiiiindoreee");
		ses.save(e1);
				//ses.persist(e1);
			ses.flush();
	tr.commit();
		//ses.close();
	
	
		//ses.persist(e1); 
		//ses.save(e1);
//				Employee2 e1=new Employee2();
//				e1.seteId(12);
//				e1.seteName("ronit");
//				e1.seteAddr("indore");
//				Employee2 e2=new Employee2();
//				e2.seteId(13);
//				e2.seteName("priya");
//				e2.seteAddr("indore");
//				tr.commit();
//				ses.close();
//				Session ses1=sf.openSession();
//				Transaction t=ses1.beginTransaction();
//				e2.seteName("abc");
//				//ses1.merge(e2);
//				ses1.merge(e1);
//				t.commit();
//				ses1.close();
				
		//ses.close();
		System.out.println("done");
		
		
	}
	

}
