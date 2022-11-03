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
		Personel personel = null;
		/*personel.setAdi("yasemin");
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
		personel.getAdresListesi().add(adres);
		personel.setDtar(new Date());*/
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		personel = (Personel)session.get(Personel.class, 1);
		System.out.println(personel.getAdresListesi().size());
		session.clear(); 
		session.close();
		
		sessionFactory.close();
		
		
	}

}
