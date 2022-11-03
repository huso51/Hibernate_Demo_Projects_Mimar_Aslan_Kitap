package com.huseyinaydin;

public class Ders {
	private long dersId;
	private String dersAdi;
	public Ders(String dersAdi) {
		super();
		this.dersAdi = dersAdi;
	}
	public long getDersId() {
		return dersId;
	}
	public void setDersId(long dersId) {
		this.dersId = dersId;
	}
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}
	
}
