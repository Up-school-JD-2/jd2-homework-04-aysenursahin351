package jd_homework4;

public class Song {
	//Şarkı sınıfı, adı, sanatçısı, albümü, uzunluğu gibi özelliklere sahip olmalıdır.
	String name;
	String artist;
	String albumName;//??
	
	String length;
	public Song(String name, String artist, String albumName, String length) {
		super();
		this.name = name;
		this.artist = artist;
		this.albumName = albumName;
		this.length = length;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	public void printAll(Song song) {
		System.out.println(song.name+" "+song.albumName+"  "+song.artist+"  "+song.length);
	}
}
