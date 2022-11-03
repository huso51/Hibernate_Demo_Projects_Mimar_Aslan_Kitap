package com.huseyinaydin;

import java.util.Date;

public class Calisan {
	private Long calisanId;
	private String calisanAdi;
	private String calisanSoyadi;
	private Date calisanDTar;
	private String telefonNo;
	private Departman departman;
	public Calisan(String calisanAdi, String calisanSoyadi, Date calisanDTar, String telefonNo) {
		super();
		this.calisanAdi = calisanAdi;
		this.calisanSoyadi = calisanSoyadi;
		this.calisanDTar = calisanDTar;
		this.telefonNo = telefonNo;
	}
	public Long getCalisanId() {
		return calisanId;
	}
	public void setCalisanId(Long calisanId) {
		this.calisanId = calisanId;
	}
	public String getCalisanAdi() {
		return calisanAdi;
	}
	public void setCalisanAdi(String calisanAdi) {
		this.calisanAdi = calisanAdi;
	}
	public String getCalisanSoyadi() {
		return calisanSoyadi;
	}
	public void setCalisanSoyadi(String calisanSoyadi) {
		this.calisanSoyadi = calisanSoyadi;
	}
	public Date getCalisanDTar() {
		return calisanDTar;
	}
	public void setCalisanDTar(Date calisanDTar) {
		this.calisanDTar = calisanDTar;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public Departman getDepartman() {
		return departman;
	}
	public void setDepartman(Departman departman) {
		this.departman = departman;
	}
	
}
