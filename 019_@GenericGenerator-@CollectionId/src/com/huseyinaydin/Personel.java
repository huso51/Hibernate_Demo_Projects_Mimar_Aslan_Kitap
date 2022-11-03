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
	
	@ElementCollection(targetClass=Adres.class,fetch=FetchType.EAGER)
    @JoinTable(name="calismayanlar_list",joinColumns=@JoinColumn(name="idcalisanlar"))
	@GenericGenerator(name = "hilo-gen",strategy = "hilo")
	@CollectionId(columns = {@Column(name = "ADRES_ID")},generator="hilo-gen",type=@Type(type="long"))
	private Set<Adres> adresListesi = new HashSet<Adres>();
	
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

	public Set<Adres> getAdresListesi() {
		return adresListesi;
	}

	public void setAdresListesi(Set<Adres> adresListesi) {
		this.adresListesi = adresListesi;
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
