package com.bridgelabz.day9;

public class Lyrics {

	public static void replaceString(String str) {
		String replaceStringa = str.replaceAll("ANIMAL", "Chicks");
		String replaceStringa1 = replaceStringa.replaceAll("SOUND", "chick");
		System.out.println(replaceStringa1);

		String replaceStringb = str.replaceAll("ANIMAL", "Duck");
		String replaceStringb1 = replaceStringb.replaceAll("SOUND", "quack");
		System.out.println(replaceStringb1);

		String replaceStringc = str.replaceAll("ANIMAL", "Turkey");
		String replaceStringc1 = replaceStringc.replaceAll("SOUND", "gobble");
		System.out.println(replaceStringc1);

		String replaceStringd = str.replaceAll("ANIMAL", "Cat -meow");
		String replaceStringd1 = replaceStringd.replaceAll("SOUND", "meow");
		System.out.println(replaceStringd1);

		String replaceStringe = str.replaceAll("ANIMAL", "Mule");
		String replaceStringe1 = replaceStringe.replaceAll("SOUND", "Heehaw");
		System.out.println(replaceStringe1);

		String replaceStringf = str.replaceAll("ANIMAL", "Turkey");
		String replaceStringf1 = replaceStringf.replaceAll("SOUND", "gobble");
		System.out.println(replaceStringf1);

		String replaceStringg = str.replaceAll("ANIMAL", "Dog");
		String replaceStringg1 = replaceStringg.replaceAll("SOUND", "bow wow");
		System.out.println(replaceStringg1);

		String replaceStringh = str.replaceAll("ANIMAL", "Pig - oink");
		String replaceStringh1 = replaceStringh.replaceAll("SOUND", "oink");
		System.out.println(replaceStringh1);

		String replaceStringi = str.replaceAll("ANIMAL", "Turtle - nerp");
		String replaceStringi1 = replaceStringi.replaceAll("SOUND", "nerp");
		System.out.println(replaceStringi1);

		String replaceStringj = str.replaceAll("ANIMAL", "Cow - moo");
		String replaceStringj1 = replaceStringj.replaceAll("SOUND", "moo");
		System.out.println(replaceStringj1);

	}

	public static void main(String[] args) {
		String str = "Old MacDonald had a farm," + " E-I-E-I-O. And on his farm he had some ANIMAL,"
				+ " E-I-E-I-O. With a SOUND, SOUND here," + " And a SOUND, SOUND there, Here a SOUND,"
				+ " there a SOUND, Everywhere a SOUND, SOUND";
		replaceString(str);

	}
}
