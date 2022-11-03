package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.huseyinaydin.Meslek;
import com.huseyinaydin.Sektor;
import com.huseyinaydin.Tecrube;

public class HibernateDeneme {

	public static void main(String[] args) {
		Meslek meslek = new Meslek();
		meslek.setMeslekAdi("Serbest meslek");
		
		Sektor sektor = new Sektor();
		sektor.setMeslekAdi("Bilgisayar Mühendisi");
		sektor.setCalismaAlani("Java");
		
		Tecrube tecrube = new Tecrube();
		tecrube.setMeslekAdi("Proje Yöneticisi");
		tecrube.setDeneyimYili(10);
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(meslek);
		session.save(sektor);
		session.save(tecrube);
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		sessionFactory.close();
		
		
	}

}
