package com.huseyinaydin;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


/**
 * The persistent class for the Ogrenci database table.
 * 
 */
@Entity
@NamedQuery(name="Ogrenci.findAll", query="SELECT o FROM Ogrenci o")
@Table(name="Ogrenci",catalog="Universite",schema="dbo")
public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=IDENTITY)
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