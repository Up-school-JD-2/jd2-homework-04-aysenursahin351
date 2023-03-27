package jd_homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		DataManager data=new DataManager();		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you want to create a user account? Y/N");
		String answer=scan.nextLine();
		if(answer.equalsIgnoreCase("Y")) {
			User user1=new User("",null,"","");;
			System.out.println("Enter User Name");
			String userName = Objects.requireNonNull(scan.nextLine(), "User Name cannot be null");
			user1.setUserName(userName);
			 System.out.println("Enter Email");
			String email = Objects.requireNonNull(scan.nextLine(), "Email cannot be null");
			user1.setEmail(email);
			System.out.println("Enter Password");
			String password = Objects.requireNonNull(scan.nextLine(), "Password cannot be null");		
             System.out.println("Your account has been created");
             String exit="";
              
             System.out.println("What do you want to do");
             System.out.println("Type the option number of the action you want to do");
             System.out.println("Option1: Search song typing songname: ");
             System.out.println("Option2: Search album typing albumname:");
             System.out.println("Option3: Add album to basket :");
             System.out.println("Option4: Buy album :");
             System.out.println(" Exit press E :");
				ArrayList<Album> BasketAlbum = new ArrayList<>();

             while(!(exit.equalsIgnoreCase("E"))) {
             String input=scan.nextLine();
             if (input.equals("1")) {
				System.out.println("Type the name of the song you want to search");
				String songName=scan.nextLine();
				data.searchSong(songName);
				
			}
             else if (input.equals("2")) {
            	 System.out.println("Type the name of the album you want to search");
 				String albumName=scan.nextLine();
 				data.searchAlbum(albumName);
             }           
             else if (input.equals("3")) {
            	 System.out.println("You are currently here for basket/cart transactions ");
 				String albumNameforBasket=scan.nextLine();
 				if(data.searchAlbum(albumNameforBasket)){
 					Album albumToAdd=data.FindAlbum(albumNameforBasket);
 					if (albumToAdd!=null) {
 	 					System.out.println("Successfully added"+" "+albumNameforBasket+" "+"basket");
 	 					Basket b=new Basket(BasketAlbum);
 	 					user1.setUserBasket(b);
 	 					user1.userBasket.addedAlbum.add(albumToAdd);

					}
 	 				
 				}
	
             }
             else if (input.equals("4")) {
            	 System.out.println("Type the name of the album you want to buy");
 				String albumName=scan.nextLine();	
 				if (BasketAlbum.isEmpty()) {
					System.out.println("basket is empty go back to option 3 then buy album");
				}
 				else {
 					
	 				System.out.println("Successfully bought"+" "+albumName);
	 				GetBasketList(BasketAlbum);
	 				System.out.println("Total Price   "+GetBasketTotal( BasketAlbum));
	 				
 					
 				}	
 			}
             
             else if (input.equalsIgnoreCase("e")) {
            	 System.out.println("You logged out.");
 				
             }
             else {
            	 System.out.println("This is not in stock/basket");
             }
             
             }

		}
		
}
	public static int GetBasketTotal(ArrayList<Album> BasketAlbum) {
		int totalPrice = 0;
			for (Iterator<Album> iterator = BasketAlbum.iterator(); iterator.hasNext();) {
			Album album = (Album) iterator.next();
			totalPrice+=album.price;
		}
			
	return totalPrice;
	
	}
	public static void GetBasketList(ArrayList<Album> BasketAlbum) {
		System.out.println("All Albums in Basket");
			for (Iterator<Album> iterator = BasketAlbum.iterator(); iterator.hasNext();) {
			Album album = (Album) iterator.next();
			System.out.println(album.albumName+" "+album.price);
		}
	}
}
