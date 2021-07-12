package com.ds;

import java.util.Scanner;

public class Main {
               //main method
	public static void main(String[] args) {
		
	        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	        String[][] deck = new String[suit.length][rank.length];
	        DeckCards deckCards = new DeckCards();
	        deckCards.createDeck(deck,suit,rank);
	        System.out.println("How many players you want to add ");
	        Scanner sc= new Scanner(System.in);
	        int players = sc.nextInt();

	    }
}

