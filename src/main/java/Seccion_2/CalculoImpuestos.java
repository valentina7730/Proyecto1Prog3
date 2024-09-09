package Seccion_2;

import java.util.Scanner;

public class CalculoImpuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el ingreso anual
        System.out.print("Ingrese el ingreso anual: ");
        double ingreso = scanner.nextDouble();

        // Definir las tasas impositivas por rango
        double[][] tasas = {
                {0, 20000, 0.10}, // Rango 1: 0 - 20,000
                {20001, 50000, 0.15}, // Rango 2: 20,001 - 50,000
                {50001, 75000, 0.20}, // Rango 3: 50,001 - 75,000
                {75001, 100000, 0.25}, // Rango 4: 75,001 - 100,000
                {100001, Double.MAX_VALUE, 0.30} // Rango 5: 100,001 en adelante
        };

        // Llamar al método para calcular el impuesto
        double impuesto = calcularImpuesto(ingreso, tasas);

        // Imprimir el resultado
        System.out.println("Ingreso: " + ingreso + ", Impuesto: " + impuesto);
    }

    /**
     * Método para calcular el impuesto según las tasas impositivas por rango.
     *
     * @param ingreso Ingreso anual del cliente.
     * @param tasas Array de tasas impositivas por rango.
     * @return Impuesto calculado para el cliente.
     */
    public static double calcularImpuesto(double ingreso, double[][] tasas) {
        double impuesto = 0;

        for (int j = 0; j < tasas.length; j++) {
            double minimo = tasas[j][0];
            double maximo = tasas[j][1];
            double tasa = tasas[j][2];

            if (ingreso >= minimo && ingreso <= maximo) {
                impuesto += (ingreso - minimo) * tasa;
                break;
            } else if (ingreso > maximo) {
                impuesto += (maximo - minimo) * tasa;
            }
        }

        return impuesto;
    }
}