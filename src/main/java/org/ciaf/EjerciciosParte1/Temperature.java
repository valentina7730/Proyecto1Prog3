package org.ciaf.EjerciciosParte1;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
