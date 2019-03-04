package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Phase 1 and 2
        int numberNeeded;
        String Username;
        Scanner keyboard= new Scanner(System.in);





        System.out.println("Hello! Welcome to the Number Guessing Game. May I please have your name?");
        Username= keyboard.nextLine();
        System.out.println("Hi"+Username+"We may now start the game...");
        System.out.println("Pick a number from 1-100");
        numberNeeded= keyboard.nextInt();
    }
}
