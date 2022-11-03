package com.huseyinaydin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "personel")
public class Personel {
	
	
	
	private int personel_id;
	
	
	private String adi;
	
	
	private String soyadi;

	@Id
	@Column(name = "personel_id")
	public int getPersonel_id() {
		return personel_id;
	}

	public void setPersonel_id(int personel_id) {
		this.personel_id = personel_id;
	}
	
	@Column(name = "adi")
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@Column(name = "soyadi")
	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	
	
	
}
