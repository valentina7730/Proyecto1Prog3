package org.ciaf.EjerciciosParte1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        scanner.close();

        System.out.println("The sum of the numbers is: " + sum);
    }
}
