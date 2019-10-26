package com.bridgelabz.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		try {
			File file = new File("C:\\Users\\Barpete Brother's\\Desktop\\MaxMin.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt())
				numbers.add(sc.nextInt());
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		int min = numbers.get(0);
		int max = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (min > numbers.get(i))
				min = numbers.get(i);
			if (max < numbers.get(i))
				max = numbers.get(i);
		}
		String minimum = "min "+min+"\n";
		String maximum = "max "+max;
		String data = minimum+maximum;
		try {
			Files.write(Paths.get("/Users/Barpete Brother's/Desktop/ResultMaxMin.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
