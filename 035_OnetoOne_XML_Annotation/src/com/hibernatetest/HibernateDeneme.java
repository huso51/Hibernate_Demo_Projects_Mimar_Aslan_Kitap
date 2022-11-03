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
import com.huseyinaydin.Personel;
import com.huseyinaydin.map.Ogrenci;
import com.huseyinaydin.map.OgrenciBilgisi;
import com.huseyinaydin.util.HibernateUtil;

public class HibernateDeneme {

	public static void main(String[] args) throws InterruptedException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try{
			transaction = session.getTransaction();
			transaction.begin();
			Ogrenci ogrenci = new Ogrenci("Azimli", "Javid");
			
			OgrenciBilgisi ogrenciBilgisi = new OgrenciBilgisi();
			ogrenciBilgisi.setAdres("Falan felan cad.");
			ogrenciBilgisi.setKayitNo("1");
			ogrenciBilgisi.setTelefonNo("05345438866");
			ogrenciBilgisi.setKayitTarihi(new Date(2016,9,11));
			ogrenciBilgisi.setDogumTarihi(new Date(1994, 9, 11));
			ogrenciBilgisi.setEmail("azimli.sican.duvari.deler@bok.com");
			
			ogrenci.setOgrenciBilgisi(ogrenciBilgisi);
			ogrenciBilgisi.setOgrenci(ogrenci);
			
			session.save(ogrenci);
			
			transaction.commit();
			System.out.println("Baþarýlý olarak kaydedildi");
		}
		catch (HibernateException e) {
			transaction.rollback();
		}
		finally {
			session.clear();
			session.close();
		}
	}

}
