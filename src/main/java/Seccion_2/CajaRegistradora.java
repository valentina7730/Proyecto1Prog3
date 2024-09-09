package Seccion_2;

import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el total de la compra
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        // Solicitar al usuario que ingrese el monto entregado
        System.out.print("Ingrese el monto entregado: ");
        double montoEntregado = scanner.nextDouble();

        // Calcular el cambio
        double cambio = calcularCambio(totalCompra, montoEntregado);

        // Desglosar el cambio en billetes y monedas
        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000,};
        int[] monedas = {500, 200, 100, 50,};

        System.out.println("Cambio a devolver:");
        desglosarCambio(cambio, billetes, monedas);
    }

    /**
     * Método para calcular el cambio.
     *
     * @param totalCompra Total de la compra.
     * @param montoEntregado Monto entregado por el cliente.
     * @return Cambio a devolver.
     */
    public static double calcularCambio(double totalCompra, double montoEntregado) {
        return montoEntregado - totalCompra;
    }

    /**
     * Método para desglosar el cambio en billetes y monedas.
     *
     * @param cambio Cambio a devolver.
     * @param billetes Array de denominaciones de billetes.
     * @param monedas Array de denominaciones de monedas.
     */
    public static void desglosarCambio(double cambio, int[] billetes, int[] monedas) {
        int cambioEntero = (int) Math.floor(cambio);
        double cambioFraccionario = cambio - cambioEntero;

        // Desglosar billetes
        for (int i = 0; i < billetes.length; i++) {
            int cantidadBilletes = cambioEntero / billetes[i];
            cambioEntero -= cantidadBilletes * billetes[i];
            System.out.println("Billetes de " + billetes[i] + ": " + cantidadBilletes);
        }

        // Desglosar monedas
        for (int i = 0; i < monedas.length; i++) {
            int cantidadMonedas = (int) Math.floor(cambioFraccionario / monedas[i]);
            cambioFraccionario -= cantidadMonedas * monedas[i];
            System.out.println("Monedas de " + monedas[i] + ": " + cantidadMonedas);
        }
    }
}
