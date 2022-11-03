package com.jpatest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.jpamodelgen.xml.jaxb.Persistence;

import com.huseyinaydin.Ogrenci;

public class JpaDeneme {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setNo("339");
		ogrenci.setAdi("Hüseyin");
		ogrenci.setSoyadi("Aydýnlýk");
		ogrenci.setFakulte("Yüksek Okul");
		ogrenci.setBolum("Boktan bölüm");
		EntityManagerFactory entityManagerFactory = javax.persistence.Persistence.createEntityManagerFactory("Proje");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(ogrenci);
		entityTransaction.commit();
		Query query = entityManager.createNamedQuery("tumOgrenciKayitlarinigetir");
		List<?> result = query.getResultList();
		for(Object object : result){
			Ogrenci ogrenci2 = (Ogrenci) object;
			System.out.println(ogrenci2.getAdi() + " " + ogrenci2.getSoyadi() + " " + ogrenci2.getFakulte() + " " + ogrenci2.getBolum());
		}
		entityManager.clear();
		entityManager.close();
		entityManagerFactory.close();
	}

}
