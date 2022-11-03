package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update Urun U set U.urunFiyat=?,U.urunAdi=? where U.urunId = ?");
		query.setParameter(0, (double)99);
		query.setParameter(1, "Gerber LMF 2");
		query.setParameter(2, 2);
		int result = query.executeUpdate();
		transaction.commit();
		/*List<?> liste = query.getResultList();
		Iterator<?> iterator = liste.iterator();
		while(iterator.hasNext()){
			Object[] dizi = (Object[]) iterator.next();
			System.out.println(dizi[0] + " " + dizi[1]);
		}*/
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
