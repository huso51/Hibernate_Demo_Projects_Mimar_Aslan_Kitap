package com.huseyinaydin;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "personel")
@Table(name = "mellotablosu")
public class Personel {
		
	private int idcalisanlar;
	
	private String adi;
	private String soyadi;
	private Date dtar;
	@Embedded
	
	private Adres adres;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="sehir",column=@Column(name = "GOCA_SEHIR")),
		@AttributeOverride(name="semt",column=@Column(name = "GOCA_SEMT"))
	})
	private Adres isAdres;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idcalisanlar")
	public int getIdcalisanlar() {
		return idcalisanlar;
	}

	public void setIdcalisanlar(int idcalisanlar) {
		this.idcalisanlar = idcalisanlar;
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

	
	@Column(name = "dtar")
	@Temporal(TemporalType.DATE)
	public Date getDtar() {
		return dtar;
	}

	public void setDtar(Date dtar) {
		this.dtar = dtar;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Adres getIsAdres() {
		return isAdres;
	}

	public void setIsAdres(Adres isAdres) {
		this.isAdres = isAdres;
	}	
	
	
	
	
}
