package com.bridgelabz.lib;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BLln {

	private static Scanner scanner;

	public static int readInt() {
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			String token = scanner.next();
			throw new InputMismatchException("attempts to read an 'int' value from standard input, "
					+ "but the next token is \"" + token + "\"");
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(
					"attemps to read an 'int' value from standard input, " + "but no more tokens are available");
		}

	}

	public static double readDouble() {
		try {
			return scanner.nextDouble();
		} catch (InputMismatchException e) {
			String token = scanner.next();
			throw new InputMismatchException("attempts to read a 'double' value from standard input, "
					+ "but the next token is \"" + token + "\"");
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException(
					"attempts to read a 'double' value from standard input, " + "but no more tokens are available");
		}
	}

	public static void main(String[] args) {
		BLStdOut.print("Type an int: ");
		int a = BLStdIn.readInt();
		BLStdOut.println("Your int was: " + a);
		BLStdOut.println();

        BLStdOut.print("Type a double: ");
        double c = BLStdIn.readDouble();
        BLStdOut.println("Your double was: " + c);
        BLStdOut.println();
	}

}
