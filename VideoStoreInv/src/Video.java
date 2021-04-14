import java.util.ArrayList;

/**
 * @author Courtney Peacock
 * @date 12/03/2021
 * Assignment 2 - VideoStore
 *
 * The goal of this assignment is to design and implement 
 * a simple inventory control system for a small video rental store.
 * 
 *  Video Class to model a video
 */

public class Video {
	private String title;
	private boolean checkedOut;
	private ArrayList<Double> averageUserRating;
	
	/**
	 * Video object constructor with title, rent status, and average rating posted
	 * @param title Title of the video
	 */
	public Video(String title) {
		this.title = title;
		checkedOut = false;
		averageUserRating = new ArrayList<Double>();
	}
	
	/**
	 * Get the title of the video
	 * @return Title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Checks if the video has been rented
	 * @return
	 */
	public boolean getCheckedOut() {
		return checkedOut;
	}
	
	/**
	 * Get the average user rating based on past ratings
	 * @return
	 */
	public double getAverageUserRating() {
		double sum = 0;
		for(int i = 0; i < averageUserRating.size(); i++) {
			sum += averageUserRating.get(i);
		}
		
		return sum/averageUserRating.size();
	}
	
	/**
	 * Set a new title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Rent a video
	 * @param video
	 * @return True for rented, false if not rented / returned to the store
	 */
	public boolean checkOut() {
		if(getCheckedOut() == false) {
			checkedOut = true;
			return checkedOut;
		}
		else {
			return checkedOut;
		}
	}
	
	/**
	 * Return a video
	 * @param video
	 * @return True is returned to store, false is still rented
	 */
	public boolean returned() {
		if(getCheckedOut() == false) {
			return checkedOut;
		}
		else {
			checkedOut = false;
			return checkedOut;
		}
	}
	
	/**
	 * Receeve a rating for a video (when we add a rating)
	 * @param rating The number for the rating
	 */
	public void recieveRating(double rating) {
		System.out.println("\n" + title + " has been rated" + ".");
		averageUserRating.add(rating);
	}
}
