package com.company;

import  java.util.Scanner;

public class MovieList{

    public static void main(String[] args)  throws Exception {

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Initialize array length with value 100
        String[] movieList = new String[100];
        // Initialize sentinel with empty string
        String sentinel = "";

        // Initialize element position of the array to zero
        int index = 0;
        while (!(sentinel.equalsIgnoreCase("q"))) {

            // Prompt the user for a movie title and get it
            System.out.print("\nEnter a movie: ");
            movieList[index] = keyboard.nextLine();
            // Increase index to access each position available in the array
            index++;

            // Prompt the user to decide whether to continue or not and get the user's answer
            System.out.print("Do you wish to quit (q/n): ");
            sentinel = keyboard.nextLine();
        }
        // Close Scanner object
        keyboard.close();

        System.out.println();
        // Display the movie list from user's input
        for (int i = 0; i < index; i++)
            System.out.println(movieList[i]);
    }
}
