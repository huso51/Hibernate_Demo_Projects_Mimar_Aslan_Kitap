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
		Personel personel1 = new Personel();
		personel1.setAdi("Hüseyin");
		personel1.setSoyadi("AYDIN");
		personel1.setDtar(new Date());
		
		Meslek meslek1 = new Meslek();
		meslek1.setMeslekAdi("Mühendis");
		
		Meslek meslek2 = new Meslek();
		meslek2.setMeslekAdi("Programcý");
		
		personel1.getMeslekListesi().add(meslek1);
		personel1.getMeslekListesi().add(meslek2);
		
		meslek1.getPersonelListesi().add(personel1);
		meslek2.getPersonelListesi().add(personel1);
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(personel1);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		sessionFactory.close();
		
		
	}

}
