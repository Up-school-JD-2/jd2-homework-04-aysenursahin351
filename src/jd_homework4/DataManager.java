package jd_homework4;

import java.util.ArrayList;
import java.util.Iterator;

public class DataManager {
    private Album album;
    ArrayList<Song> songs = new ArrayList<>();
    ArrayList<Song> AllSongs = new ArrayList<>();
    ArrayList<Album> AllAlbum = new ArrayList<>();
    public DataManager() {
        super();
        addSongsToAlbum();
    }
    private void addSongsToAlbum() {
       
        Song song1 = new Song("Fearless", "Taylor Swift", "Fearless", "4:32");
        Song song2 = new Song("You're Not Sorry", "Taylor Swift", "Fearless","4:22");
        Song song3 = new Song("Love Story", "Taylor Swift", "Fearless",  "3:54");
        Song song4 = new Song("Breathe", "Taylor Swift", "Fearless", "4:24");
        AddToList(songs, AllSongs, song1);
        AddToList(songs, AllSongs, song2);
        AddToList(songs, AllSongs, song3);
        AddToList(songs, AllSongs, song4);
        album = new Album("Fearless", "Taylor Swift", "4.10.2020", songs,350);
        AllAlbum.add(album);
     // Second album
        ArrayList<Song> songs2 = new ArrayList<>();
        Song song2_1 = new Song("We Are Never Ever Getting Back Together", "Taylor Swift", "Red", "3:13");
        Song song2_2 = new Song("I Knew You Were Trouble", "Taylor Swift", "Red", "3:39");
        AddToList(songs2, AllSongs, song2_1);
        AddToList(songs2, AllSongs, song2_2);
        Album album2 = new Album("Red", "Taylor Swift", "10/22/2012", songs2,550);
        AllAlbum.add(album2);

    }
 
    public void AddToList(ArrayList<Song> songs,ArrayList<Song> AllSongs,Song song1) {
    	 AllSongs.add(song1);
         songs.add(song1);
    }
    public boolean searchSong(String search_item) {
    	boolean flag =false;
    	for (Iterator<Song> iterator = AllSongs.iterator(); iterator.hasNext();) {
			Song song = (Song) iterator.next();
			if (song.name.equals(search_item)) {
				String s=FindSong(search_item).albumName;
				System.out.println("This song is in this album :"+s);				
				System.out.println("Album's Price is :"+FindAlbum(s).price);
				song.printAll(song);
				return flag =true;
			}			
		}
		return flag;
    }
    public void getAllBasket(User user1) {
    	System.out.println("All Products in Basket");
    		for (Iterator<Album> iterator = user1.userBasket.addedAlbum.iterator(); 
    				iterator.hasNext();) {
    		Album albumAllbasket = (Album) iterator.next();   		
			System.out.println(albumAllbasket.albumName+" "+albumAllbasket.price);
    		
    	}}
    public boolean getSearchBasket(User user1,String albumName) {
    	System.out.println("All Products in Basket");
    		for (Iterator<Album> iterator = user1.userBasket.addedAlbum.iterator(); 
    				iterator.hasNext();) {
    		Album albumAllbasket = (Album) iterator.next();
    		if (albumName.equals(albumAllbasket.albumName)) {
    			return true;
    		}	
    		else {
    			System.out.println("First you add to basket");
    			return false;
    		}
    	}
			return false;}
    public Song FindSong(String search_item) {
    	Song song=null;
    	for (Iterator<Song> iterator = AllSongs.iterator(); iterator.hasNext();) {
			 song = (Song) iterator.next();
			if (song.albumName.equals(search_item)) {
				return song;
			}	
		}
    	return song;
    }
    
    public Album FindAlbum(String search_item) {
    	for (Iterator<Album> iterator = AllAlbum.iterator(); iterator.hasNext();) {
			Album album = (Album) iterator.next();
			if (album.albumName.equals(search_item)) {
				return album;
			}	
		}
    	return album;
    }
    public boolean searchAlbum(String search_item) {
    	boolean flag =false;
    	for (Iterator<Album> iterator = AllAlbum.iterator(); iterator.hasNext();) {
			Album album = (Album) iterator.next();
			if (album.albumName.equals(search_item)) {
				System.out.println("This Album is in stock...");
				//// album bilgileri
				album.printAll(album);
				System.out.println("Album's Price is :"+album.price);
				return flag=true;
			}
			else {
				System.out.println("This Album is not in stock...");
				System.out.println("Sorry...");
			}
			
		}
		return flag;
    }
}