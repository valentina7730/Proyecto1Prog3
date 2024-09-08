package org.ciaf.EjerciciosParte1;

public class MagicNumber {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isMagic(int n) {
        while (n >= 10) {
            n = sumDigits(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isMagic(number)) {
            System.out.println("The number " + number + " is magic.");
        } else {
            System.out.println("The number " + number + " is not magic.");
        }
        scanner.close();
    }
}
