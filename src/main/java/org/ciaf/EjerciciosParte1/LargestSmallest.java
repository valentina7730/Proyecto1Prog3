package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter number 1: ");
        int largest = scanner.nextInt();
        int smallest = largest;

        for (int i = 1; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        scanner.close();

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
