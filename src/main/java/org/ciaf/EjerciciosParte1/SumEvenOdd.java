package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();


        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }


        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        scanner.close();
    }
}