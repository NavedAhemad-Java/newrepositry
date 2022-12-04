package com.bikkadIt.Naved.HibernetDemo.copy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadIt.Bank.model.Fruit1;
import com.bikkadIt.Bank.model.Mango;

public class EmbadMain {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	      cfg.configure("hibernate.cfg.xml");
	      SessionFactory factory= cfg.buildSessionFactory();
	      Session session = factory.openSession();
	      
	      
	      
	      Fruit1 fr= new Fruit1();
	      fr.setId(102);
	      fr.setName("Apple");
	      fr.setColour("Red");
	      fr.setRate(50);
	      
	      Mango mg = new Mango();
	      mg.setIdz(110);
	      mg.setPrize(1200);
	      mg.setVariety("Apple");
	      fr.setMango(mg);
	      
	      
	      
	      
	      
	      Transaction ft = session.beginTransaction();
	      //session.save(st);//
	      session.persist(fr);
	      ft.commit();
	      session.close();
	    
	}

}
