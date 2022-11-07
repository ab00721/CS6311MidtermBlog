package edu.westga.cs6311.main;

import edu.westga.cs6311.blog.Blog;
import edu.westga.cs6311.post.Post;
import edu.westga.cs6311.author.Author;

/**
 * Main class to call info from blog, post, and author classes 
 * @author Anna Blood
 * @version 9/21/22
 */
public class Main {

	/**
	 * Application entry point
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Blog myBlogSite = new Blog();
		Author myAuthor = new Author("Anna", "Anna@gmail.com", 25);
		Post myPostOne = new Post("Learning Program Construction", 437, "09/01/2022", myAuthor);
		Post myPostTwo = new Post("Learning Web Technologies", 729, "09/05/2022", myAuthor);

		System.out.println(myBlogSite.getBlogDetails());
		myBlogSite.setPostOne(myPostOne);
		myBlogSite.setPostTwo(myPostTwo);
		System.out.println(myBlogSite.getBlogDetails());

	}

}
