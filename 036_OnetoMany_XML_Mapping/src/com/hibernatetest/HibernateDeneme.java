package com.hibernatetest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.LockModeType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Calisan;
import com.huseyinaydin.Departman;
import com.huseyinaydin.util.HibernateUtil;

public class HibernateDeneme {

	public static void main(String[] args) throws InterruptedException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.getTransaction();
			transaction.begin();
			
			Departman departman = new Departman();
			departman.setDepartmanAdi("Departman1");
			session.save(departman);
			
			Calisan calisan = new Calisan("Hüseyin", "Aydýn", new Date(1994, 9,11),"05345438866");
			Calisan calisan2 = new Calisan("Hasan", "Aydýn", new Date(1994, 9,11),"05345438866");
			Calisan calisan3 = new Calisan("Veli", "Aydýn", new Date(1994, 9,11),"05345438866");
			
			calisan.setDepartman(departman);
			calisan2.setDepartman(departman);
			calisan3.setDepartman(departman);
			
			session.save(calisan);
			session.save(calisan2);
			session.save(calisan3);
			
			Departman departman2 = new Departman();
			departman2.setDepartmanAdi("Departman2");
			session.save(departman2);
			
			Calisan calisan4 = new Calisan("Þirin", "Aydýn", new Date(1994, 9,11),"05345438866");
			calisan4.setDepartman(departman2);
			session.save(calisan4);
			
			transaction.commit();
			System.out.println("Baþarýlý olarak kaydedildi");
		}
		catch (NullPointerException e) {
			transaction.rollback();
			System.out.println("Hata var : "+e.toString());
		}
		finally {
			session.clear();
			session.close();
		}
	}

}
