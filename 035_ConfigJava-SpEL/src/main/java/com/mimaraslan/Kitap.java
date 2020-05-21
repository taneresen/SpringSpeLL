package com.mimaraslan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitapBean")
public class Kitap {
	
	
	@Value("Piraye")
	private String eserAdi;
	
	@Value("123456")
	private long eserISBN;
	
	
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	
	public String kitapBilgisiniYaz(String yazarAdi, String yazarSoyadi,String eserAdi, Long eserISBN) {
		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;
		return  "\n\t YAZAR : " +yazarAdi+" "+yazarSoyadi +
				"\n\t KiTAP : " +getEserAdi() +
				"\n\t ISBN : "  +getEserISBN();
	}
	

}
