package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.huseyinaydin.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		/*for(int i = 0; i<6; i++){
			Personel personel = new Personel();
			personel.setAdi("Hüseyin ");
			personel.setDtar(new Date(1994, 9, 11));
			personel.setSoyadi("Aydýn " + i);
			session.save(personel);
		}*/
		Personel personel = session.get(Personel.class, 5);
		System.out.println(personel.getIdcalisanlar() + " " + personel.getAdi() + " " + personel.getSoyadi() + " " + personel.getDtar());
		//session.delete(personel);
		personel.setAdi("Tatar");
		personel.setSoyadi("Ramazan");
		personel.setDtar(new Date(1974, 1, 11));
		session.update(personel);
		
		session.getTransaction().commit();
		session.clear(); 
		session.close();
		sessionFactory.close();
	}

}
