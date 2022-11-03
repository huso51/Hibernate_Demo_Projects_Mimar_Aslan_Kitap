package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.ordering.antlr.Factory;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//toplu kaydetme
		
		/*for (int i = 0; i < 100000; i++) {
			Urun urun = new Urun();
			urun.setUrunAdi("Testere");
			urun.setUrunFiyat(100.0);
			session.save(urun);
			
			if(i%25==0){
				session.flush();
				session.clear();
			}
		}*/
		
		
		//toplu guncelleme
		ScrollableResults resultsCursor = session.createQuery("from Urun").scroll();
		int sayac = 0;
		while (resultsCursor.next()) {
			Urun urun = (Urun) resultsCursor.get(0);
			urun.setUrunAdi("Ahmet");//yeni isim
			session.save(urun);
			if(++sayac % 25 == 0){
				session.flush();
				session.clear();
			}
		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
