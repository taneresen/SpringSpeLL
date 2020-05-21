package com.mimaraslan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("yazarBean")
public class Yazar {
	
	@Value("#{kitapBean}")
	private Kitap kitap;
	
	@Value("Canan")
	private String adi;
	
	@Value("Tan")
	private String soyAdi;
	
	@Value("#{kitapBean.eserAdi}")
	private String kitapAdi;
	
	

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	@Override
	public String toString() {
		return  "kitap=" + kitap +
				", \nadi=" + adi + 
				", \nsoyAdi=" + soyAdi +
				", \nkitapAdi=" + kitapAdi ;
	}
	
	

}
