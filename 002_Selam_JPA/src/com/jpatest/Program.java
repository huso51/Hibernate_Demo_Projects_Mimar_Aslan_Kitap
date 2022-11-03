package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory;
		EntityManager entityManager;
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Hüseyin");
		ogrenci.setSoyadi("Aydýn");
		ogrenci.setFakulte("Yüksek Okul");
		ogrenci.setBolum("Bilgisayar");
		entityManagerFactory = Persistence.createEntityManagerFactory("002_Selam_JPA");
		entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(ogrenci);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
