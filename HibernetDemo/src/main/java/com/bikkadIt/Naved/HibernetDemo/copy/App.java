package com.bikkadIt.Naved.HibernetDemo.copy;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadIt.Bank.model.Student1;





public class App 
{
	
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");
      SessionFactory factory= cfg.buildSessionFactory();
      Session session = factory.openSession();
      
      
      Student1 st = new Student1();
      st.setId(101);
      st.setName("Naved");
      st.setDept("abc");
      st.setEmail("naved@gmail.com");
      
      Transaction ft = session.beginTransaction();
      //session.save(st);//
      session.persist(st);
      ft.commit();
      session.close();
    
      
    }
}
