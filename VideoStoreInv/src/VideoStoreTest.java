import static org.junit.Assert.*;
import org.junit.Test;

public class VideoStoreTest {

	VideoStore video = new VideoStore();
	
	/**
	 * This test performs a test where we add the 3 movies in order from the requirements, "The Matrix", "Godfather II", "Star Wars Episode IV: A New Hope".
	 */
	@Test
	public void addAssignmentVideosTest() {
		assertEquals("The Matrix has been successfully added to the system inventory.", video.addVideo("The Matrix"));
		assertEquals("Godfather II has been successfully added to the system inventory.", video.addVideo("Godfather II"));
		assertEquals("Star Wars Episode IV: A New Hope has been successfully added to the system inventory.", video.addVideo("Star Wars Episode IV: A New Hope"));
	}
	
	/**
	 * This test performs a test where we attempt to add 11 movies where inventory is set to 10
	 */
	@Test
	public void addElevenVideosTest() {
		assertEquals("The Matrix has been successfully added to the system inventory.", video.addVideo("The Matrix"));
		assertEquals("Godfather II has been successfully added to the system inventory.", video.addVideo("Godfather II"));
		assertEquals("Star Wars Episode IV: A New Hope has been successfully added to the system inventory.", video.addVideo("Star Wars Episode IV: A New Hope"));
		assertEquals("Finding Nemo has been successfully added to the system inventory.", video.addVideo("Finding Nemo"));
		assertEquals("1917 has been successfully added to the system inventory.", video.addVideo("1917"));
		assertEquals("Citizen Kane has been successfully added to the system inventory.", video.addVideo("Citizen Kane"));
		assertEquals("Casablanca has been successfully added to the system inventory.", video.addVideo("Casablanca"));
		assertEquals("Rosemary's Baby has been successfully added to the system inventory.", video.addVideo("Rosemary's Baby"));
		assertEquals("The Way We Were has been successfully added to the system inventory.", video.addVideo("The Way We Were"));
		assertEquals("Sixteen Candles has been successfully added to the system inventory.", video.addVideo("Sixteen Candles"));
		assertEquals("Unable to add video, inventory max is set to 10.", video.addVideo("A Streetcar Named Desire")); // STELLAAAAAAAA
		
	}
	
	/**
	 * This test performs a test where we add the video, confirm renting that video marks the video has rented.
	 */
	@Test
	public void  checkoutVideoTrueTest() {
		video.addVideo("Star Wars Episode IV: A New Hope");
		assertEquals(true, video.checkout("Star Wars Episode IV: A New Hope"));
	}
	
	/**
	 * This test performs a test where we add the video, attempt to rent a video the store does not have, "Harry Potter and the Philosophers Stone".
	 */
	@Test
	public void  checkoutVideoFalseTest() {
		video.addVideo("Godfather II");
		assertEquals(false, video.checkout("Harry Potter and the Philosophers Stone"));
	}
	

	/**
	 * This test performs a test where we add Star Wars Episode IV: A New Hope, rent it and return it.
	 */
	@Test
	public void  returnVideoTrueTest() {
		video.addVideo("Star Wars Episode IV: A New Hope");
		video.checkout("Star Wars Episode IV: A New Hope");
		assertEquals(true, video.returnVideo("Star Wars Episode IV: A New Hope"));
	}
	
	
	/**
	 * This test performs a test where we add the video GFII, rent it, but attempt to return Die Hard.  
	 */
	@Test
	public void  returnVideoFalseTest() {
		video.addVideo("Godfather II");
		video.checkout("Godfather II");
		assertEquals(false, video.returnVideo("Die Hard"));
	}
	
	/**
	 * This test confirms that adding a user rating is possible, giving Godfather II adding the rating of 7 to its rating pool. 
	 */
	@Test
	public void  addUserRatingTest() {
		video.addVideo("Godfather II");
		assertEquals("Godfather II has been rated.", video.receiveRating("Godfather II", 7));
	}

	/**
	 * This test performs a test where we add Star Wars Episode IV: A New Hope to the store, and rate it a few times 
	 * which allows the average to be calculated with getAverageUserRating 
	 */
	@Test
	public void  avareageUserRatingTest() {
		video.addVideo("Star Wars Episode IV: A New Hope");
		video.receiveRating("Star Wars Episode IV: A New Hope", 9);
		video.receiveRating("Star Wars Episode IV: A New Hope", 8);
		video.receiveRating("Star Wars Episode IV: A New Hope", 10);
		video.receiveRating("Star Wars Episode IV: A New Hope", 8);
		video.receiveRating("Star Wars Episode IV: A New Hope", 7);
		assertEquals(8.4, video.getAverageUserRating("Star Wars Episode IV: A New Hope"), .1);
	}
	
		
}
