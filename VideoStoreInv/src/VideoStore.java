/**
 * @author Courtney Peacock
 * @date 12/03/2021
 * Assignment 2 - VideoStore
 *
 * VideoStore to model the actual store.
 */

public class VideoStore {
	private Video[] videos;
	private final int vidSize = 10;
	private int i = 0;
	private int length = 0;
	
	public VideoStore() {
		videos = new Video[vidSize];
	}
	
	/**
	 * Add a movie to inventory
	 * @param title Movie to be added
	 */
	public String addVideo(String title) {
		if(i < vidSize) {
			videos[i] = new Video(title);
			i++;
			
			return title + " has been successfully added to the system inventory.";
		}
		
		else
			return "Unable to add video, inventory max is set to 10.";
	}
	
	/**
	 * Check out a video
	 * @param title Video to check out
	 */
	public boolean checkout(String title) {
		for(int v = 0; v < videos.length; v++) {
			if(videos[v] == null) {
				break;
			}
			
			else if(videos[v].getTitle().equals(title)) {
				if(videos[v].getCheckedOut() == false) {
					System.out.println(title + " has been rented.");
					videos[v].checkOut();
					return true;
				}
			}
		}
		 return false;
	}
	
	/**
	 * Return a video to the store
	 * @param title Video to return
	 */
	public boolean returnVideo(String title) {
		for(int v = 0; v < videos.length; v++) {
			if(videos[v] == null) {
				break;
			}
			
			if(videos[v].getTitle().equals(title)) {
				if(videos[v].getCheckedOut() == true) {
					System.out.println(title + " has been returned\n");
					videos[v].returned();
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Get a rating for a video
	 * @param title Title of the video getting rated
	 * @param rating Rate value
	 * @return
	 */
	public String receiveRating(String title, int rating) {
		for(int v = 0; v < videos.length; v++) {
			if(videos[v] == null) {
				break;
			}
			
			else if(videos[v].getTitle().equals(title)) {
				videos[v].recieveRating(rating);
				return title + " has been rated.";
			}
		}
		
		return title + " has not been rated yet.";
	}
	
	/**
	 * List all the videos in inventory
	 */
	public void listInventory() {
		for(int v = 0; v < videos.length; v++) {
			if(videos[v] == null) {
				break;
			}
			System.out.println("Title: " + videos[v].getTitle() +"\nRented: " + videos[v].getCheckedOut() +
								"\nAverage Rating: " + videos[v].getAverageUserRating() + "\n");
		}
	}
	
	/**
	 * Get the amount of videos that can be put into inventory
	 * @return size Inventory size
	 */
	public int videoLength() {
		for(int v = 0; v < videos.length; v++) {
			length++;
		}
		return length;
	}
	/**
	 * Get the average user rating for a specific video
	 * @param title Title of the video
	 * @return rating The rating of the video
	 */
	public double getAverageUserRating(String title) {
		double rating = 0;
		for(int v = 0; v < videos.length; v++) {
			if(videos[v] == null)
				break;
			else if(videos[v].getTitle().equals(title)) {
				rating = videos[v].getAverageUserRating();
			}
		}
		return rating;
	}
}
