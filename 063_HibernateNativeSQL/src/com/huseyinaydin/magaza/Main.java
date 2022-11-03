package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		Query query = session.createSQLQuery("select * from Urun U");
		((SQLQuery) query).addEntity(Urun.class);
		List<Urun> list = (List<Urun>)query.getResultList();
		for(Urun urun : list){
			System.out.println(urun.getUrunId() + " " + urun.getUrunAdi() + " " + urun.getUrunFiyat());
		}
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
