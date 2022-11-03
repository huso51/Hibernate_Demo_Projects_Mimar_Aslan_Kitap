package com.jpatest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.huseyinaydin.Ogrenci;

import sun.misc.GC;

public class JpaDeneme {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci("Abdülmuttalip", "FenasiKerim", "Bombook", "2", "ZýmzýmettinKelTaþakOðullarý");
		Ogrenci ogrenci2 = new Ogrenci("Þebelebelemelebettin.!", "oww yehhh", "Bombook", "2",
				"ZýmzýmettinKelTaþakOðullarý");
		Ogrenci ogrenci3 = new Ogrenci("kakule", "Tatarramazanoðullarý", "Bombook", "2", "ZýmzýmettinKelTaþakOðullarý");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Proje");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(ogrenci);
			entityManager.persist(ogrenci2);
			entityManager.persist(ogrenci3);
			//int i = 10 / 0;
			entityManager.getTransaction().commit();
		} catch (RuntimeException ex) {
			entityManager.getTransaction().rollback();
			System.out.println("Ýþlemler geri alýndý çünkünüm hata verdi. ahan da hatýnýn kodu mesajý : " + ex.getMessage());
		}
		finally {
			if(entityManager!=null){
				tumKayitlariYaz(entityManager);
				entityManager.clear();
				entityManager.close();
				entityManagerFactory.close();
			}
			Runtime.getRuntime().gc();
		}
	}
	
	/*public static void tumKayitlariYaz(EntityManager entityManager){
		Query query = entityManager.createNamedQuery("sorgum1");
		List<?> result = query.getResultList();
		for(Object object : result){
			Ogrenci ogrenci2 = (Ogrenci) object;
			System.out.println(ogrenci2.getAdi() + " " + ogrenci2.getSoyadi() + " " + ogrenci2.getFakulte() + " " + ogrenci2.getBolum());
		}
	}*/
	
	public static void tumKayitlariYaz(EntityManager entityManager,int id){
		Query query = entityManager.createQuery("SELECT ogr FROM Ogrenci ogr where ogr.id = "+id);
		List<?> result = query.getResultList();
		for(Object object : result){
			Ogrenci ogrenci2 = (Ogrenci) object;
			System.out.println(ogrenci2.getAdi() + " " + ogrenci2.getSoyadi() + " " + ogrenci2.getFakulte() + " " + ogrenci2.getBolum());
		}
	}
	
	public static void tumKayitlariYaz(EntityManager entityManager){
		Query query = entityManager.createNamedQuery("sorgum2");
		query.setParameter("p_id", 23);
		query.setParameter("p_soyadi", "ZýmzýmettinKelTaþakOðullarý");
		List<?> result = query.getResultList();
		for(Object object : result){
			Ogrenci ogrenci2 = (Ogrenci) object;
			System.out.println(ogrenci2.getAdi() + " " + ogrenci2.getSoyadi() + " " + ogrenci2.getFakulte() + " " + ogrenci2.getBolum());
		}
	}

}
