package com.huseyinaydin;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Ogrenci database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="sorgum1", query="SELECT o FROM Ogrenci o"),
	@NamedQuery(name="sorgum2", query="SELECT ogr FROM Ogrenci ogr where ogr.id = :p_id and ogr.soyadi = :p_soyadi")
})

public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Adi")
	private String adi;

	@Column(name="Bolum")
	private String bolum;

	@Column(name="Fakulte")
	private String fakulte;

	@Column(name="No")
	private String no;

	@Column(name="Soyadi")
	private String soyadi;

	public Ogrenci() {
	}
	
	

	public Ogrenci(String adi, String bolum, String fakulte, String no, String soyadi) {
		super();
		this.adi = adi;
		this.bolum = bolum;
		this.fakulte = fakulte;
		this.no = no;
		this.soyadi = soyadi;
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return this.adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getBolum() {
		return this.bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getFakulte() {
		return this.fakulte;
	}

	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSoyadi() {
		return this.soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}