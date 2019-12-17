package com.bridgelabz.day9;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularExpression {
	public static void replaceString(String str) {

		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		String strReplaceName = str.replaceAll("<<name>>", "sachin");
		strReplaceName = strReplaceName.replaceAll("<<full name>>", "sachin Barpete");
		strReplaceName = strReplaceName.replaceAll("xxxxxxxxxx", "8109555221");
		strReplaceName = strReplaceName.replaceAll("01/01/2016", date);

		System.out.println(strReplaceName);
	}

	public static void main(String[] args) throws FileNotFoundException {

		String str = "Hello <<name>>,\nWe have your full name as <<full name>> in our system."
				+ "\nyour contact number is 91-xxxxxxxxxx. Please,"
				+ " let us know \nin case of any clarification Thank you BridgeLabz 01/01/2016.";
		replaceString(str);
	}
}
