package com.huseyinaydin;

import java.util.HashSet;
import java.util.Set;

public class Ogrenci {
	private long ogrenciId;
	private String ogrenciAdi;
	private Adres adres;

	public Ogrenci(String ogrenciAdi) {
		super();
		this.ogrenciAdi = ogrenciAdi;
	}

	public Ogrenci(String ogrenciAdi, Adres adres) {
		super();
		this.ogrenciAdi = ogrenciAdi;
		this.adres = adres;
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

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
