package com.bridgelabz;

public class GamblingSimulator {

	public static int stake = 100;
	public final int bet = 1;

	public static void main(String[] args) {

		System.out.println("Welcome to Gambling Simulator");

		int RANDOM = (int) Math.floor(Math.random() * 2);

		if (RANDOM == 0) {
			stake++;
			System.out.println("Gambler won the game ");
			System.out.println("Gambler having stake after bet $ " + stake);
		}

		else {
			stake--;

			System.out.println("Gambler lose the game ");
			System.out.println("Gambler having stake after bet $ " + stake);
		}

	}

}
