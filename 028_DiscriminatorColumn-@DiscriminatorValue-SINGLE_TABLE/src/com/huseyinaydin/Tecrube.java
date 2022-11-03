package com.huseyinaydin;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="TECRUBE")
public class Tecrube extends Sektor {
	private int deneyimYili;

	public int getDeneyimYili() {
		return deneyimYili;
	}

	public void setDeneyimYili(int deneyimYili) {
		this.deneyimYili = deneyimYili;
	}
	
}
