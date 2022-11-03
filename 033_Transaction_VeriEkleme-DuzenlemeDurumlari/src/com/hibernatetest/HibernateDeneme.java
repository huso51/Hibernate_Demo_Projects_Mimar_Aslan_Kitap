package com.hibernatetest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.LockModeType;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) throws InterruptedException {
		Personel personel = new Personel();
		personel.setAdi("Huseyin");
		personel.setSoyadi("Aydin");
		personel.setDtar(new Date(1994,9,11));
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(personel);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		personel.setAdi("Yasemin");
		personel.setSoyadi("Kocabas");
		personel.setDtar(new Date(1993, 9, 12));
		session.getTransaction().begin();
		session.update(personel);
		session.getTransaction().commit();
		session.clear();
		session.close();
		sessionFactory.close();
	}

}
