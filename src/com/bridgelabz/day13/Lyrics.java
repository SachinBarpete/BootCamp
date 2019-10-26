package com.bridgelabz.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Lyrics {
	public static void replaceString(String str, String s1, String s2) {
		String replacedStr = str.replaceAll("ANIMAL", s1);
		replacedStr = replacedStr.replaceAll("SOUND", s2);
		System.out.println(replacedStr);
	}
	
	public static void main(String[] args) {

		ArrayList<String> string = new ArrayList<>();

		try (Scanner s = new Scanner(new FileReader("C:\\Users\\Barpete Brother's\\Desktop\\Lyrics.txt"))) {
			while (s.hasNext()) {
				string.add(s.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		String str = "";
		for (int i = 0; i < string.size(); i++) {
			str += string.get(i);
		}

		replaceString(str, "Chicks", "chick");
		replaceString(str, "Duck", "quack");
		replaceString(str, "Turkey", "gobble");
		replaceString(str, "Cat", "meow-meow");
		replaceString(str, "Mule", "Heehaw");
		replaceString(str, "Dog", "bow wow");
		replaceString(str, "Pig", "oink - oink");
		replaceString(str, "Turtle", "nerp - nerp");
		replaceString(str, "Cow", "moo - moo");

	}
}
