package com.huseyinaydin;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "personel")
@Table(name = "calismayanlar")
public class Personel {
		
	private int idcalisanlar;
	
	private String adi;
	
	private String soyadi;
	private Date dtar;
	private String adres;

	@Id
	@GeneratedValue
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

	
	@Column(name = "dtar")
	@Temporal(TemporalType.DATE)
	public Date getDtar() {
		return dtar;
	}

	public void setDtar(Date dtar) {
		this.dtar = dtar;
	}

	
	@Column(name = "adres")
	@Lob
	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
}
