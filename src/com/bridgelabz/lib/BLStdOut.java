package com.bridgelabz.lib;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class BLStdOut {

	// force Unicode UTF-8 encoding; otherwise it's system dependent
	private static final String CHARSET_NAME = "UTF-8";

	// assume language = English, country = US for consistency with StdIn
	private static final Locale LOCALE = Locale.US;

	// send output here
	private static PrintWriter out;

	// this is called before invoking any methods
	static {
		try {
			out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
		} catch (UnsupportedEncodingException e) {
			System.out.println(e);
		}
	}

	public static void println(int x) {
		out.println(x);
	}

	// don't instantiate
	private BLStdOut() {
	}

	public static void print(String x) {
		out.print(x);
		out.flush();
	}

	public static void println(String x) {
		out.println(x);
	}

	public static void println() {
		out.println();
	}

	public static void printf(String format, Object... args) {
		out.printf(LOCALE, format, args);
		out.flush();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BLStdOut.print("Hello ");
		BLStdOut.println("user ");
		BLStdOut.println();
		BLStdOut.printf("Welcome");

	}

}
