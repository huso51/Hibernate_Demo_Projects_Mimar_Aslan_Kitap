package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Meslek;
import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("yasemin");
		personel.setSoyadi("Zýmzýmeddin");
		Meslek meslek = new Meslek();
		meslek.setMeslekAdi("Hurdacý");
	    personel.setMeslek(meslek);
		personel.setDtar(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(personel);
		session.save(meslek);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		sessionFactory.close();
		
		
	}

}
