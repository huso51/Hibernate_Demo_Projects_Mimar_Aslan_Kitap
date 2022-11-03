package com.huseyinaydin;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "personel")
@Table(name = "calismayanlar")
public class Personel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idcalisanlar")
	private int idcalisanlar;
	
	@OneToOne
	@JoinColumn(name = "MESLEK_ID")
	private Meslek meslek;
	
	@Column(name = "adi")
	private String adi;
	
	@Column(name = "soyadi")
	
	private String soyadi;
	@Column(name = "dtar")
	
	@Temporal(TemporalType.DATE)
	private Date dtar;
	

	public int getIdcalisanlar() {
		return idcalisanlar;
	}

	public void setIdcalisanlar(int idcalisanlar) {
		this.idcalisanlar = idcalisanlar;
	}

	public Meslek getMeslek() {
		return meslek;
	}

	public void setMeslek(Meslek meslek) {
		this.meslek = meslek;
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

	public Date getDtar() {
		return dtar;
	}

	public void setDtar(Date dtar) {
		this.dtar = dtar;
	}

}
