package edu.westga.cs6311.author;

/**
 * Create variables, constructors, methods, getters, and setters for Author
 * @author Anna Blood
 *  @version 9/21/22
 *
 */
public class Author {
	private String name;
	private String email;
	private String number;
	private int phoneNumber;
	private int age;
	
	/**
	 * Constructor
	 * @param authName sets name
	 * @param authEmail sets email
	 * @param authAge sets age
	 */
	public Author(String authName, String authEmail, int authAge) {
		this.name = authName;
		this.email = authEmail;
		this.age = authAge;
		this.phoneNumber = 1015021011;
	}
	
	/**
	 * Method to format phone number
	 * @return phone number 
	 */
	private String formatAuthorPhoneNumber() {
		this.number = String.format("%d", this.getPhoneNumber());
		return this.number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
	}
	
	/**
	 * Method to get author details
	 * @return author details 
	 */
	public String getAuthorDetails() {
		return "Author's name: " + this.getName() + ", Email: " + this.getEmail() 
		+ ", Phone number: " + this.formatAuthorPhoneNumber() + ", Age: " + this.getAge();
	}
	
	/**
	 * Getter for name
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter for name
	 * @param nName to set new name
	 */
	public void setName(String nName) {
		this.name = nName;
	}
	
	/**
	 * Getter for email
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Setter for email
	 * @param nEmail to set new email
	 */
	public void setEmail(String nEmail) {
		this.email = nEmail;
	}

	/**
	 * Getter for phoneNumber
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * Setter for phoneNumber
	 * @param nPhoneNumber to set new phoneNumber
	 */
	public void setPhoneNumber(int nPhoneNumber) {
		this.phoneNumber = nPhoneNumber;
	}

	/**
	 * Getter for age
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Setter for age
	 * @param nAge to set new age
	 */
	public void setAge(int nAge) {
		this.age = nAge;
	}
}
