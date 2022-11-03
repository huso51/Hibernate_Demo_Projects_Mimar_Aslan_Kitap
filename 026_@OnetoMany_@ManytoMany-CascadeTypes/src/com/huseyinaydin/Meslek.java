package com.huseyinaydin;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meslek")
public class Meslek {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int meslekId;
	private String meslekAdi;
	
	//@ManyToMany(mappedBy="meslekListesi") tek yönlü olmuþ oluyor. bu durum da personel tablosu hakim olan taraf
	@ManyToMany(mappedBy="meslekListesi")
	private Collection<Personel> personelListesi = new ArrayList<>();
	
	public int getMeslekId() {
		return meslekId;
	}
	public void setMeslekId(int meslekId) {
		this.meslekId = meslekId;
	}
	public String getMeslekAdi() {
		return meslekAdi;
	}
	public void setMeslekAdi(String meslekAdi) {
		this.meslekAdi = meslekAdi;
	}
	public Collection<Personel> getPersonelListesi() {
		return personelListesi;
	}
	public void setPersonelListesi(Collection<Personel> personelListesi) {
		this.personelListesi = personelListesi;
	}
	
}
