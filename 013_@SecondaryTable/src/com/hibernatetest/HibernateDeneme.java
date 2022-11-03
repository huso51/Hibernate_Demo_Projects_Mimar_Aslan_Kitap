package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("abdullah");
		personel.setSoyadi("Zýmzýmeddin");
		personel.setAdres("Þebelekdjgkjfgkjdfkjgsf<khgjj kdh gkjdfkgjkj gkfjg kfgkj sdgkj kdsfjgk jdfgkjdf");
		personel.setDtar(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(personel);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		
		session = sessionFactory.openSession();
		personel = (Personel)session.get(Personel.class, 1);
		
		sessionFactory.close();
		
		
	}

}
