package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("Husame");
		personel.setSoyadi("Binladen");
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(personel);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		sessionFactory.close();
	}

}
