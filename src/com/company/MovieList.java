package com.company;

import  java.util.Scanner;

public class MovieList{

    public static void main(String[] args)  throws Exception {

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Initialize array length with value 100
        String[] movieList = new String[100];
        // Initialize movie with empty string and sentinel with letter "n"
        String movie = "", sentinel = "n";

        // Initialize element position of the array to zero
        int index = 0;
        while (!(sentinel.equalsIgnoreCase("q"))) {

            // Prompt the user for a movie title and get it
            System.out.print("\nEnter a movie: ");
            movie = keyboard.nextLine();
            movieList[index] = movie;

            // Validate the user input so that a movie is not repeated in the list
            for (int i = 0; i < index; i++) {
                while (movieList[i].equalsIgnoreCase(movie)) {
                    System.out.println("This movie exists in the list. Enter another movie:");
                    movie = keyboard.nextLine();
                    movieList[index] = movie;
                }
            }
            // Increase index to access each position available in the array
            index++;

            // Prompt the user to decide whether to continue or not and get the user's answer
            System.out.print("Do you wish to quit (q/n)? ");
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
