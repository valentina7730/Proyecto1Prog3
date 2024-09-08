package org.ciaf.EjerciciosParte1;

public class DigitCounter {
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return (int) Math.log10(Math.abs(n)) + 1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        System.out.println("The number " + number + " has " + digitCount + " digits.");
        scanner.close();
    }
}
