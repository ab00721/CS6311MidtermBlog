package edu.westga.cs6311.post;

import edu.westga.cs6311.author.Author;

/**
 * Create variables, constructors, methods, getters, and setters for Post
 * @author Anna Blood
 * @version 9/21/22
 *
 */
public class Post {
	private String title;
	private String datePosted;
	private Author postAuthor;	
	private int length;
	private double postValue;

	/**
	 * Constructor 
	 * @param newTitle sets new title
	 * @param newLength sets new length
	 * @param newDatePosted sets new date
	 * @param newPostAuthor sets new author 
	 */
	public Post(String newTitle, int newLength, String newDatePosted, Author newPostAuthor) {
		this.title = newTitle;
		this.length = newLength;
		this.datePosted = newDatePosted;
		this.postAuthor = newPostAuthor;
		this.postValue = 0; 
	}
	
	/**
	 * Method to set post value with increase factor 
	 * @param increaseFactor to set factor
	 */
	public void calculatePostValue(double increaseFactor) {
		this.setPostValue(increaseFactor * 2.75);
		}
	
	/**
	 * Method to get post details
	 * @return post details 
	 */
	public String getPostDetails() {
		String.valueOf(this.getPostValue());
		return "Post: " + this.getTitle() + ", Length: " + this.getLength() + ", Posted on: " 
				+ this.getDatePosted() + ", Current value: $" + String.format("%.2f", this.getPostValue())
				+ "\nAuthor's info: " + this.getPostAuthor().getAuthorDetails(); 
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
	 * Getter for datePosted
	 * @return the datePosted
	 */
	public String getDatePosted() {
		return this.datePosted;
	}
	
	/**
	 * Setter for datePosted
	 * @param nDatePosted to set new datePosted
	 */
	public void setDatePosted(String nDatePosted) {
		this.datePosted = nDatePosted;
	}
	
	/**
	 * Getter for postAuthor
	 * @return the postAuthor
	 */
	public Author getPostAuthor() {
		return this.postAuthor;
	}
	
	/**
	 * Setter for postAuthor
	 * @param nPostAuthor to set new postAuthor
	 */
	public void setPostAuthor(Author nPostAuthor) {
		this.postAuthor = nPostAuthor;
	}
	
	/**
	 * Getter for length
	 * @return the length
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Setter for length
	 * @param nLength to set new length
	 */
	public void setLength(int nLength) {
		this.length = nLength;
	}
	
	/**
	 * Getter for postValue
	 * @return the postValue
	 */
	public double getPostValue() {
		return this.postValue;
	}
	
	/**
	 * Setter for postValue
	 * @param nPostValue to set new postValue
	 */
	public void setPostValue(double nPostValue) {
		this.postValue = nPostValue;
	}
}
