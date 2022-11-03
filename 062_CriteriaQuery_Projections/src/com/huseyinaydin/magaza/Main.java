package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
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
		Criteria criteria = session.createCriteria(Urun.class);
		criteria.setProjection(Projections.max("urunFiyat"));
		Double max = (Double)criteria.uniqueResult();
		
		criteria.setProjection(Projections.min("urunFiyat"));
		Double min = (Double)criteria.uniqueResult();
		
		criteria.setProjection(Projections.sum("urunFiyat"));
		Double total = (Double)criteria.uniqueResult();
		
		criteria.setProjection(Projections.avg("urunFiyat"));
		Double ortalama = (Double)criteria.uniqueResult();
		
		
		System.out.println(max + " " + min + " " + total + " " + ortalama);
		
		
		
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
