package jd_homework4;

import java.util.ArrayList;
import java.util.Iterator;

public class Basket {
//Sepet sınıfı, sepete eklenen öğelerin listesi, toplam fiyat gibi özelliklere sahip olmalıdır.
	ArrayList<Album> addedAlbum=new ArrayList();
	public Basket( ArrayList<Album> addedAlbum) {
		super();
		this.addedAlbum = addedAlbum;
	}
	
	public ArrayList<Album> getAddedAlbum() {
		return addedAlbum;
	}
	
public void setAddedAlbum(ArrayList<Album> addedAlbum) {
		this.addedAlbum = addedAlbum;
	}



}
