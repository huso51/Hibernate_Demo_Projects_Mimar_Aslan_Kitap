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
		Query query = session.createQuery("from Urun");
		query.setFirstResult(2);
		query.setMaxResults(3);
		List<Urun> depo = (List<Urun>)query.getResultList();
		for(Urun urun : depo){
			System.out.println(urun.getUrunId() + " " + urun.getUrunAdi() + " " + urun.getUrunFiyat());
		}
		
		transaction.commit();
		/*List<?> liste = query.getResultList();
		Iterator<?> iterator = liste.iterator();
		while(iterator.hasNext()){
			Object[] dizi = (Object[]) iterator.next();
			System.out.println(dizi[0] + " " + dizi[1]);
		}*/
		//session.flush();
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
