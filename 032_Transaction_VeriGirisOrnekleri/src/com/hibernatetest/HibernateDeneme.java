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

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		/*
		 * for(int i = 0; i<6; i++){ Personel personel = new Personel();
		 * personel.setAdi("Hüseyin "); personel.setDtar(new Date(1994, 9, 11));
		 * personel.setSoyadi("Aydýn " + i); session.save(personel); }
		 */

		Map<String, Object> properties = new HashMap<>();
		properties.put("javax.persistence.lock.timeout", 5000);

		Personel personel = session.find(Personel.class, 7, LockModeType.READ, properties);
		
		//session.refresh(personel, LockModeType.PESSIMISTIC_READ, properties);
		
		System.out.println(personel.getIdcalisanlar() + " " + personel.getAdi() + " " + personel.getSoyadi() + " "
				+ personel.getDtar());

		Personel personel2 = session.load(Personel.class, 7);
		System.out.println(personel2.getAdi());

		try {
			session.getTransaction().commit();
			session.clear();
			session.close();
			sessionFactory.close();
		} catch (Exception ex) {

		}

		SessionFactory sessionFactory2 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session2 = sessionFactory2.openSession();

		Personel personel3 = session2.find(Personel.class, 7);
		System.out.println(personel3.getAdi());

		session2.clear();
		session2.close();
		sessionFactory2.close();

	}

}
