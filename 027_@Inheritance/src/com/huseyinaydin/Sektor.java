package com.huseyinaydin;

import javax.persistence.Entity;

@Entity
public class Sektor extends Meslek {
	private String calismaAlani;

	public String getCalismaAlani() {
		return calismaAlani;
	}

	public void setCalismaAlani(String calismaAlani) {
		this.calismaAlani = calismaAlani;
	}
	
}
