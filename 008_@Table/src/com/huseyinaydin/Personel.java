package com.huseyinaydin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "personel")
@Table(name = "calisanlar")
public class Personel {
	
	
	
	private int idcalisanlar;
	
	
	private String adi;
	
	
	private String soyadi;

	
	
	
	@Column(name = "adi")
	public String getAdi() {
		return adi;
	}

	
	@Id
	@Column(name = "idcalisanlar")
	public int getIdcalisanlar() {
		return idcalisanlar;
	}

	public void setIdcalisanlar(int idcalisanlar) {
		this.idcalisanlar = idcalisanlar;
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
