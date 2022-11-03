package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select U.urunAdi,SUM(U.urunFiyat) from Urun as U group by U.urunAdi");

		List<?> liste = query.getResultList();
		Iterator<?> iterator = liste.iterator();
		while(iterator.hasNext()){
			Object[] dizi = (Object[]) iterator.next();
			System.out.println(dizi[0] + " " + dizi[1]);
		}
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
