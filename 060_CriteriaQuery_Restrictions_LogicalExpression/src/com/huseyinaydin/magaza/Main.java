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
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.ordering.antlr.Factory;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Urun.class);
		Criterion criterion = Restrictions.lt("urunFiyat", (double)50);
		Criterion criterion2 = Restrictions.like("urunAdi", "V%");
		LogicalExpression expression = Restrictions.and(criterion, criterion2);
		criteria.add(expression);
		
		
		List<Urun> liste = (List<Urun>)criteria.list();
		for(Urun urun : liste){
			System.out.println(urun.getUrunId() + " " + urun.getUrunAdi() + " " + urun.getUrunFiyat());
		}
		//session.flush();
		session.close();
		sessionFactory.close();
		System.out.println("bitti");
	}

}
