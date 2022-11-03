package com.hibernatetest;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.LockModeType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Adres;
import com.huseyinaydin.Ogrenci;
import com.huseyinaydin.util.HibernateUtil;

public class HibernateDeneme {

	public static void main(String[] args) throws InterruptedException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.getTransaction();
			transaction.begin();
			
			Adres adres = new Adres("Süleyman Fethi", "Niðde", "Falanca", "51100");
			
			Ogrenci ogrenci = new Ogrenci("Hüseyin",adres);
			Ogrenci ogrenci2 = new Ogrenci("Hasan",adres);
			Ogrenci ogrenci3 = new Ogrenci("Türkan",adres);
			Ogrenci ogrenci4 = new Ogrenci("Hüseyin",adres);
			
			session.save(ogrenci);
			session.save(ogrenci2);
			session.save(ogrenci3);
			session.save(ogrenci4);
			
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
