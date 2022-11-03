package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Adres;
import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setAdi("yasemin");
		personel.setSoyadi("Zýmzýmeddin");
		Adres adres = new Adres();
		adres.setCadde("Falan");
		adres.setDaireNo("filan");
		adres.setKapiNo("asasa");
		adres.setKat("34");
		adres.setMahalle("asfrmb");
		adres.setPostaKodu("9898f");
		adres.setSehir("fhjghng");
		adres.setSemt("yjhbg");
		
		
		personel.setAdres(adres);
		personel.setIsAdres(adres);
		personel.setDtar(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(personel);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		
		session = sessionFactory.openSession();
		personel = (Personel)session.get(Personel.class, 1);
		
		sessionFactory.close();
		
		
	}

}
