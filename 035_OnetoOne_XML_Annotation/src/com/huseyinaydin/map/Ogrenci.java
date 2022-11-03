package com.huseyinaydin.map;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ogrenciId;
	private String ogrenciAdi;
	private String ogrenciSoyadi;
	private OgrenciBilgisi ogrenciBilgisi;
	public Ogrenci(String ogrenciAdi, String ogrenciSoyadi) {
		super();
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyadi = ogrenciSoyadi;
	}
	public int getOgrenciId() {
		return ogrenciId;
	}
	public void setOgrenciId(int ogrenciId) {
		this.ogrenciId = ogrenciId;
	}
	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}
	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}
	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}
	public OgrenciBilgisi getOgrenciBilgisi() {
		return ogrenciBilgisi;
	}
	public void setOgrenciBilgisi(OgrenciBilgisi ogrenciBilgisi) {
		this.ogrenciBilgisi = ogrenciBilgisi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
