package com.huseyinaydin;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "personel")
@Table(name = "calismayanlar")
public class Personel {
		
	private int idcalisanlar;
	
	private String adi;
	
	private String soyadi;

	@Id
	@Column(name = "idcalisanlar")
	public int getIdcalisanlar() {
		return idcalisanlar;
	}

	public void setIdcalisanlar(int idcalisanlar) {
		this.idcalisanlar = idcalisanlar;
	}

	@Column(name = "adi")
	@Basic
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@Column(name = "soyadi")
	@Transient
	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	
	
	
}
