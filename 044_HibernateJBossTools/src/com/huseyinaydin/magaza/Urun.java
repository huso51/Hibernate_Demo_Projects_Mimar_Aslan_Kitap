package com.huseyinaydin.magaza;
// Generated 03.Ara.2016 19:30:13 by Hibernate Tools 5.2.0.Beta1

/**
 * Urun generated by hbm2java
 */
public class Urun implements java.io.Serializable {

	private int urunId;
	private String urunAdi;
	private double urunFiyat;

	public Urun() {
	}

	public Urun(int urunId) {
		this.urunId = urunId;
	}

	public Urun(int urunId, String urunAdi, double urunFiyat) {
		this.urunId = urunId;
		this.urunAdi = urunAdi;
		this.urunFiyat = urunFiyat;
	}

	public int getUrunId() {
		return this.urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public String getUrunAdi() {
		return this.urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public double getUrunFiyat() {
		return this.urunFiyat;
	}

	public void setUrunFiyat(double urunFiyat) {
		this.urunFiyat = urunFiyat;
	}

}
