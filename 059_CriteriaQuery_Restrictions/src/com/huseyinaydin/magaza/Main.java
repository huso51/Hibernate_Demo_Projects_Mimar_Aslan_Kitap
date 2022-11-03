package com.huseyinaydin.magaza;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.ordering.antlr.Factory;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.eq("urunFiyat", (double)50));//eþit olanlar hacým
		
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.ne("urunFiyat", (double)50));//eþit olmayanlar hacým
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.lt("urunFiyat", (double)50)); güçük olanlar
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.gt("urunFiyat", (double)50)); böyük olanlar
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.le("urunFiyat", (double)50)); küçük eþit olanlar
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.ge("urunFiyat", (double)50)); böyük eþit olanlar
		//Criteria criteria = session.createCriteria(Urun.class).add(Restrictions.like("urunAdi", "K%"); içinde olanlar
		
		
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
