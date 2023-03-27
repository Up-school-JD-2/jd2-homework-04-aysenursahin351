package jd_homework4;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
//Her albüm sınıfı, albüm adı, sanatçı adı, yayın tarihi, şarkılarının listesi gibi özelliklere sahip olmalıdır.

String albumName;
String artistName;
String releaseDate;
int price;
public Album(String albumName, String artistName, String releaseDate,  ArrayList<Song> arrayList,int price) {
	super();
	this.albumName = albumName;
	this.artistName = artistName;
	this.releaseDate = releaseDate;
	this.price = price;
	this.arrayList = arrayList;
}
ArrayList<Song>arrayList=new ArrayList<Song>();

 public ArrayList<Song> getArrayList() {
	return arrayList;
}
public void setArrayList(ArrayList<Song> arrayList) {
	this.arrayList = arrayList;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAlbumName() {
	return albumName;
}
public void setAlbumName(String albumName) {
	this.albumName = albumName;
}
public String getArtistName() {
	return artistName;
}
public void setArtistName(String artistName) {
	this.artistName = artistName;
}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}


///get arraylist
public void printAll(Album album) {
	System.out.println(album.albumName+"  "+album.artistName+"  "+album.releaseDate+" ");
	System.out.println("********Album's Song*********");
  for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
	Song song = (Song) iterator.next();
	System.out.println(song.name);
}
}


}
