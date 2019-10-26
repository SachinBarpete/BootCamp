package com.bridgelabz.lib;

import java.util.Random;

public class BLRandom {

	private static Random random;
	private static long seed;
	static {
		// this is how the seed was set in Java 1.4
		seed = System.currentTimeMillis();
		random = new Random(seed);
	}

	// don't instantiate
	private BLRandom() {
	}

	public static void setSeed(long s) {
		seed = s;
		random = new Random(seed);
	}

	/**
	 * Returns the seed of the pseudo-random number generator.
	 *
	 * @return the seed
	 */
	public static long getSeed() {
		return seed;
	}

	/**
	 * Returns a random real number uniformly in [0, 1).
	 *
	 * @return a random real number uniformly in [0, 1)
	 */
	public static double uniform() {
		return random.nextDouble();
	}

	/**
	 * Returns a random integer uniformly in [0, n).
	 * 
	 * @param n number of possible integers
	 * @return a random integer uniformly between 0 (inclusive) and {@code n}
	 *         (exclusive)
	 * @throws IllegalArgumentException if {@code n <= 0}
	 */
	public static int uniform(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("argument must be positive: " + n);
		return random.nextInt(n);
	}

	/**
	 * Returns a random real number uniformly in [a, b).
	 * 
	 * @param a the left endpoint
	 * @param b the right endpoint
	 * @return a random real number uniformly in [a, b)
	 * @throws IllegalArgumentException unless {@code a < b}
	 */
	public static double uniform(double a, double b) {
		if (!(a < b)) {
			throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
		}
		return a + uniform() * (b - a);
	}

	/**
	 * Returns a random boolean from a Bernoulli distribution with success
	 * probability <em>p</em>.
	 *
	 * @param p the probability of returning {@code true}
	 * @return {@code true} with probability {@code p} and {@code false} with
	 *         probability {@code 1 - p}
	 * @throws IllegalArgumentException unless {@code 0} &le; {@code p} &le;
	 *                                  {@code 1.0}
	 */
	public static boolean bernoulli(double p) {
		if (!(p >= 0.0 && p <= 1.0))
			throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
		return uniform() < p;
	}

	/**
	 * Returns a random real number from a standard Gaussian distribution.
	 * 
	 * @return a random real number from a standard Gaussian distribution (mean 0
	 *         and standard deviation 1).
	 */
	public static double gaussian() {
		// use the polar form of the Box-Muller transform
		double r, x, y;
		do {
			x = uniform(-1.0, 1.0);
			y = uniform(-1.0, 1.0);
			r = x * x + y * y;
		} while (r >= 1 || r == 0);
		return x * Math.sqrt(-2 * Math.log(r) / r);

		// Remark: y * Math.sqrt(-2 * Math.log(r) / r)
		// is an independent random gaussian
	}

	/**
	 * Returns a random real number from a Gaussian distribution with mean &mu; and
	 * standard deviation &sigma;.
	 * 
	 * @param mu    the mean
	 * @param sigma the standard deviation
	 * @return a real number distributed according to the Gaussian distribution with
	 *         mean {@code mu} and standard deviation {@code sigma}
	 */
	public static double gaussian(double mu, double sigma) {
		return mu + sigma * gaussian();
	}

	/**
	 * Returns a random integer from the specified discrete distribution.
	 *
	 * @param probabilities the probability of occurrence of each integer
	 * @return a random integer from a discrete distribution: {@code i} with
	 *         probability {@code probabilities[i]}
	 * @throws IllegalArgumentException if {@code probabilities} is {@code null}
	 * @throws IllegalArgumentException if sum of array entries is not (very nearly)
	 *                                  equal to {@code 1.0}
	 * @throws IllegalArgumentException unless {@code probabilities[i] >= 0.0} for
	 *                                  each index {@code i}
	 */
	public static int discrete(double[] probabilities) {
		if (probabilities == null)
			throw new IllegalArgumentException("argument array is null");
		double EPSILON = 1.0E-14;
		double sum = 0.0;
		for (int i = 0; i < probabilities.length; i++) {
			if (!(probabilities[i] >= 0.0))
				throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
			sum += probabilities[i];
		}
		if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
			throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

		// the for loop may not return a value when both r is (nearly) 1.0 and when the
		// cumulative sum is less than 1.0 (as a result of floating-point roundoff
		// error)
		while (true) {
			double r = uniform();
			sum = 0.0;
			for (int i = 0; i < probabilities.length; i++) {
				sum = sum + probabilities[i];
				if (sum > r)
					return i;
			}
		}
	}

	/**
	 * Rearranges the elements of the specified array in uniformly random order.
	 *
	 * @param a the array to shuffle
	 * @throws IllegalArgumentException if {@code a} is {@code null}
	 */
	public static void shuffle(double[] a) {
		validateNotNull(a);
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + uniform(n - i); // between i and n-1
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}

	// throw an IllegalArgumentException if x is null
	// (x can be of type Object[], double[], int[], ...)
	private static void validateNotNull(Object x) {
		if (x == null) {
			throw new IllegalArgumentException("argument is null");
		}
	}

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		if (args.length == 2)
			BLRandom.setSeed(Long.parseLong(args[1]));
		double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
		String[] a = "A B C D E F G".split(" ");

		System.out.println("seed = " + BLRandom.getSeed());
		for (int i = 0; i < n; i++) {
			System.out.printf("%2d ", uniform(100));
			System.out.printf("%8.5f ", uniform(10.0, 99.0));
			System.out.printf("%5b ", bernoulli(0.5));
			System.out.printf("%7.5f ", gaussian(9.0, 0.2));
			System.out.printf("%1d ", discrete(probabilities));
			for (String s : a)
				System.out.print(s);
			System.out.println();
		}

	}

}
