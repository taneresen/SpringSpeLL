package com.mimaraslan;

public class Yazar {
	
	
	private Kitap kitap;
	
	private String adi,soyAdi,kitapAdi;
	
	private String bilgi;
	

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
	
	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}

	@Override
	public String toString() {
		return  "kitap=" + kitap +
				", \nadi=" + adi + 
				", \nsoyAdi=" + soyAdi +
				", \nkitapAdi=" + kitapAdi ;
	}


	
	

}
