package com.huseyinaydin;

import java.util.Set;

public class Departman {
	private Long departmanId;
	private String departmanAdi;

	private Set<Calisan> calisan;

	public Long getDepartmanId() {
		return departmanId;
	}

	public void setDepartmanId(Long departmanId) {
		this.departmanId = departmanId;
	}

	public String getDepartmanAdi() {
		return departmanAdi;
	}

	public void setDepartmanAdi(String departmanAdi) {
		this.departmanAdi = departmanAdi;
	}

	public Set<Calisan> getCalisan() {
		return calisan;
	}

	public void setCalisan(Set<Calisan> calisan) {
		this.calisan = calisan;
	}

}
