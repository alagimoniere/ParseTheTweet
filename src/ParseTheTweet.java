/* ParseTheTweet.java
 * Author: Alyssa Lagimoniere
 * Submission Date: 1/30/15
 * 
 * Purpose: To use the different methods of the String class to parse
 * information from a tweet. 
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {

		//Define scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Tell user to enter tweet
		System.out.print("Enter tweet: ");
		String tweet = keyboard.nextLine();
		
		//Declare variables
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;
		int start;
		int finish;
		
		//Print variables
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start + 5, finish);
		type = type.toUpperCase();
		System.out.println("Type: \t\t" + type);
		
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";",start);
		detail = tweet.substring(start + 5, finish);
		detail = detail.replace(",", "-");
		System.out.println("Detail: \t" + detail);
		
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";",start);
		location = tweet.substring(start + 5, finish);
		location = location.replace(",", "-");
		System.out.println("Location: \t" + location);
		
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";",start);
		latitude = tweet.substring(start + 5, finish);
		System.out.println("Latitude: \t" + latitude);
		
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";",start);
		longitude = tweet.substring(start + 5, finish);
		System.out.println("Longitude: \t" + longitude);
		
	}


}
