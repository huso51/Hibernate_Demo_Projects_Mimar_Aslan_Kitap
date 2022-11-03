package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.jpamodelgen.xml.jaxb.Persistence;

import com.huseyinaydin.Ogrenci;

public class Program {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = javax.persistence.Persistence.createEntityManagerFactory("PU_Ayar_Dosyasi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAdi("Husam");
		ogrenci.setSoyadi("Susam");
		ogrenci.setFakulte("Amele");
		ogrenci.setNo("8");
		ogrenci.setBolum("Bazarcý");
		entityManager.persist(ogrenci);
		entityTransaction.commit();
		entityManager.clear();
		entityManager.close();
		entityManagerFactory.close();
	}

}
