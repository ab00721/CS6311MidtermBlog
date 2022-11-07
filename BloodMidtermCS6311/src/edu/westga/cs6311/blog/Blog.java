package edu.westga.cs6311.blog;

import edu.westga.cs6311.author.Author;
import edu.westga.cs6311.post.Post;

/**
 * Create variables, getters, setters, and methods for Blog
 * @author Anna Blood
 * @version 9/21/22
 *
 */
public class Blog {
	
	private String title;
	private String siteAddress;
	private Post postOne;
	private Post postTwo;
	
	/**
	 * Constructor 
	 * to initialize data field values
	 */
	public Blog() {
		Author author = new Author("Anna", "Anna@gmail.com", 25);
		this.postOne = new Post("Learning Java", 211, "09/15/2022", author);
		this.postTwo = new Post("Learning HTML", 374, "09/21/2022", author);
	}
	
	/**
	 * Method to generate a post factor
	 * @return random double 0 to 1 
	 */
	private double generatePostFactor() {
		return Math.random();
	}
	
	/**
	 * Method to generate post value by using generatePostFactor() 
	 * as increasFactor for calculatePostValue()
	 */
	public void generatePostValue() {
		this.getPostOne().calculatePostValue(this.generatePostFactor());
		this.getPostTwo().calculatePostValue(this.generatePostFactor());
	}
	
	/**
	 * Method to get blog details for each post object
	 * @return post details of post objects 
	 */
	public String getBlogDetails() {
		this.generatePostValue();
		return this.getPostOne().getPostDetails() + this.getPostTwo().getPostDetails();
	}
	
	/**
	 * Getter for title
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Setter for title
	 * @param nTitle to set new title
	 */
	public void setTitle(String nTitle) {
		this.title = nTitle;
	}
	
	/**
	 * Getter for siteAddress
	 * @return the siteAddress
	 */
	public String getSiteAddress() {
		return this.siteAddress;
	}
	
	/**
	 * Setter for siteAddress
	 * @param nSiteAddress to set new siteAddress
	 */
	public void setSiteAddress(String nSiteAddress) {
		this.siteAddress = nSiteAddress;
	}

	/**
	 * Getter for postOne
	 * @return the postOne
	 */
	public Post getPostOne() {
		return this.postOne;
	}
	
	/**
	 * Setter for postOne
	 * @param nPostOne to set new postOne
	 */
	public void setPostOne(Post nPostOne) {
		this.postOne = nPostOne;
	}
	
	/**
	 * Getter for postTwo
	 * @return the postTwo
	 */
	public Post getPostTwo() {
		return this.postTwo;
	}
	
	/**
	 * Setter for postTwo
	 * @param nPostTwo to set new postTwo
	 */
	public void setPostTwo(Post nPostTwo) {
		this.postTwo = nPostTwo;
	}
	
}
