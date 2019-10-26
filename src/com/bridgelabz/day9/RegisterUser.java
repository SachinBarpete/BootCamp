package com.bridgelabz.day9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {

	public static boolean isValidName(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));

	}

	public static boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static boolean isValidPhone(String phone) {
		Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(phone);
		return (m.find() && m.group().equals(phone));
	}
	public static boolean isValidCompany(String company) {
		return true;
	}

	public static boolean isValidUserId(String userId) {
		String regex = "^[a-zA-Z0-9]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(userId);
		return matcher.matches();

	}

	public static boolean isValidPassword(String password) {
		Pattern pattern;
		Matcher matcher;
		final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first name : ");
		String fName = scan.nextLine();
		System.out.println(isValidName(fName));
		
		System.out.print("Enter last name : ");
		String lName = scan.nextLine();
		System.out.println(isValidName(lName));
		
		System.out.print("Enter Email : ");
		String email = scan.nextLine();
		System.out.println(isValidEmail(email));
		
		System.out.print("Enter phone number : +91 ");
		String phone = scan.nextLine();
		System.out.println(isValidPhone(phone));
		
		System.out.print("Enter Company name : ");
		String company = scan.nextLine();
		System.out.println(isValidCompany(company));
		
		System.out.print("Enter UserId : ");
		String userId = scan.nextLine();
		System.out.println(isValidUserId(userId));
		
		System.out.print("Enter Password : ");
		String password = scan.nextLine();
		System.out.println(isValidPassword(password));
		
		scan.close();
	}

}
