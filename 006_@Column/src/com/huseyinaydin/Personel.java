package com.huseyinaydin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "personel")
public class Personel {
	
	@Id
	@Column(name = "personel_id")
	private int personel_id;
	
	@Column(name = "adi")
	private String adi;
	
	@Column(name = "soyadi")
	private String soyadi;

	public int getPersonel_id() {
		return personel_id;
	}

	public void setPersonel_id(int personel_id) {
		this.personel_id = personel_id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	
	
	
}
