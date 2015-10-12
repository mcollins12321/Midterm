/**
 * 
 */
package com.cisc181.core;
import java.util.Date;
import java.util.regex.Pattern;

import com.cisc181.core.Person;

/**
 * @author GE60
 *
 */
public class PersonException extends Exception {
	private static Person person;
	private static Date date = new Date();
	

	/**
	 * 
	 */
	public PersonException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(Date DOB) {
		if(person.getDOB() < date=100) {
			person.setDOB(null);
			System.out.print("This is an ivalid date of birth");
		}

		// TODO Auto-generated method stub
	}
	public static void main(String phone) {
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		Pattern pattern = Pattern.compile(regex);
	
		if(person.getPhone() != pattern.matcher(regex)) {
			person.setPhone(null);
			System.out.print("This is an ivalid date of phone number");
		}

}
