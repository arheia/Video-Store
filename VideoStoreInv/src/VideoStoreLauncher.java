/**
 * @author Courtney Peacock
 * @date 12/03/2021
 * Assignment 2 - VideoStore
 * 
 * VideoStoreLauncher to test functionality of Video and VideoStore (Give multiple ratings like a spammer, rent and return.) 
 */

public class VideoStoreLauncher {

	public static void main(String[] args) {
		VideoStore videoStore = new VideoStore();
		
		// Adds 3 videos: The Matrix, Godfather II, and Star Wars Episode IV: A New Hope.
		System.out.println("Added Movies: \n");
		videoStore.addVideo("The Matrix");
		videoStore.addVideo("Godfather II");
		videoStore.addVideo("Star Wars Episode IV: A New Hope");
		videoStore.listInventory(); 
	
		// Ratings a few times per video - Printing these individually came out really strange so I just left it on the rented output.
		videoStore.receiveRating("The Matrix", 8);
		videoStore.receiveRating("The Matrix", 9);
		videoStore.receiveRating("The Matrix", 3);
		videoStore.receiveRating("The Matrix", 7);
		videoStore.receiveRating("The Matrix", 10);
	 		
		videoStore.receiveRating("Godfather II", 7);
		videoStore.receiveRating("Godfather II", 9);
		videoStore.receiveRating("Godfather II", 10);
		videoStore.receiveRating("Godfather II", 9);
		videoStore.receiveRating("Godfather II", 9);
	
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 9);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 8);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 10);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 8);
		videoStore.receiveRating("Star Wars Episode IV: A New Hope", 7);
	    				
 		//Rents each movie once.
		System.out.println("\n\nRented Videos with Average Rating: \n");
		videoStore.checkout("The Matrix");
		videoStore.checkout("Star Wars Episode IV: A New Hope");
		videoStore.checkout("Godfather II");
		videoStore.listInventory(); 
		
		System.out.println("\n\nReturned Videos: \n");
		videoStore.returnVideo("The Matrix");
		videoStore.returnVideo("Godfather II");
		videoStore.returnVideo("Star Wars Episode IV: A New Hope");
		videoStore.listInventory(); 
		
		System.out.println("\n\nInventory after Godfather II is rented: \n");
		videoStore.checkout("Godfather II");
		videoStore.listInventory(); 
				
	}

}

