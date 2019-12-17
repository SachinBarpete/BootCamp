package com.bridgelabz.day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Birthdate {
	private static Date dateGen() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1992, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(1992, 12, 31).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		Date date = Date.from(randomBirthDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		return date;

	}

	private static void birthdate() {
		int[] arr = new int[12];
		for (int i = 0; i < 50; i++) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dateGen());
			@SuppressWarnings("deprecation")
			int month = calendar.getTime().getMonth();
			arr[month]++;

		}
		String[] temp = new String[arr.length];

		for (int i = 0; i < 12; i++) {
			String data = "";
			data = (i + 1) + " - " + arr[i] + "\n";
			temp[i] = data;
		}
		
		String data = String.join("", temp);
		try {
			Files.write(Paths.get("/home/admin1/Desktop/birthday.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		birthdate();

	}

}
