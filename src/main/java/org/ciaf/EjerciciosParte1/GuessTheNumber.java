package org.ciaf.EjerciciosParte1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;


        int attempts = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("You have to guess a number between 1 and 100.");

        while (true) {

            System.out.print("Enter your attempt (" + (attempts + 1) + "): ");
            int attempt = scanner.nextInt();


            attempts++;


            if (attempt == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (attempt < secretNumber) {
                System.out.println("The number you're looking for is higher.");
            } else {
                System.out.println("The number you're looking for is lower.");
            }
        }


        scanner.close();
    }
}