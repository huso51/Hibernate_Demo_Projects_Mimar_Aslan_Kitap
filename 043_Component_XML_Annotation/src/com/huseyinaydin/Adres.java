package com.huseyinaydin;

public class Adres {
	private long adresId;
	private String cadde;
	private String sehir;
	private String sokak;
	private String postaKodu;
	
	
	
	public Adres() {
		super();
	}
	public Adres(String cadde, String sehir, String sokak, String postaKodu) {
		super();
		this.cadde = cadde;
		this.sehir = sehir;
		this.sokak = sokak;
		this.postaKodu = postaKodu;
	}
	public long getAdresId() {
		return adresId;
	}
	public void setAdresId(long adresId) {
		this.adresId = adresId;
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	
}
