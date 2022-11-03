package com.huseyinaydin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personel {
	private int personel_id;
	private String adi,soyadi;
	
	@Id
	public String getAdi() {
		return adi;
	}
	public int getPersonel_id() {
		return personel_id;
	}
	public void setPersonel_id(int personel_id) {
		this.personel_id = personel_id;
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
