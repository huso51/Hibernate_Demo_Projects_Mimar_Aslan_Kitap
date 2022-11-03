package com.huseyinaydin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Program {

	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setPersonel_id(4);
		personel.setAdi("Ömer Faruk");
		personel.setSoyadi("Aydýn");
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(personel);
		transaction.commit();
		session.clear();
		session.close();
	}
}
