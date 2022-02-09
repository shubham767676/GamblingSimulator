package com.bridgelabz;

import java.util.Scanner;

public class GamblingSimulator {

public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulator");
		int stake = 100;
		int bet = 1;
		int TRIAL = (int) Math.floor(Math.random() * 2);
        
		if (TRIAL == 0) {
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
