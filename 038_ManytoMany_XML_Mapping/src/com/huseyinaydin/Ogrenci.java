package com.huseyinaydin;

import java.util.HashSet;
import java.util.Set;

public class Ogrenci {
	private long ogrenciId;
	private String ogrenciAdi;
	private Set<Ders> dersler = new HashSet<>();
	public Ogrenci(String ogrenciAdi) {
		super();
		this.ogrenciAdi = ogrenciAdi;
	}
	
	
	
	public Ogrenci(String ogrenciAdi, Set<Ders> dersler) {
		super();
		this.ogrenciAdi = ogrenciAdi;
		this.dersler = dersler;
	}



	public long getOgrenciId() {
		return ogrenciId;
	}
	public void setOgrenciId(long ogrenciId) {
		this.ogrenciId = ogrenciId;
	}
	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}
	public Set<Ders> getDersler() {
		return dersler;
	}
	public void setDersler(Set<Ders> dersler) {
		this.dersler = dersler;
	}
	
	
}
