package com.bridgelabz.day10;

public class Deck {
	private void deckOfCards() {
		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("----- Person " + (i + 1) + " -----");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (Card " + ((i+1) + j * 4) + ")");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.deckOfCards();
	}
}