package Seccion_2;

import java.util.Scanner;

public class CalculoNotasFinales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // Crear un array bidimensional para almacenar las notas
        double[][] notas = new double[numEstudiantes][3];

        // Solicitar al usuario que ingrese las notas de los estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese las notas del estudiante " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Llamar al método para calcular las notas finales
        Resultado resultado = calcularNotasFinales(notas);

        // Imprimir los resultados
        System.out.println("Notas finales:");
        for (double nota : resultado.notasFinales) {
            System.out.println(nota);
        }
        System.out.println("Aprobados: " + resultado.aprobados);
        System.out.println("Reprobados: " + resultado.reprobados);
    }

    /**
     * Método para calcular las notas finales y determinar aprobados y reprobados.
     *
     * @param notas Array bidimensional con las notas de los estudiantes.
     * @return Objeto Resultado con las notas finales, aprobados y reprobados.
     */
    public static Resultado calcularNotasFinales(double[][] notas) {
        int aprobados = 0;
        int reprobados = 0;
        double[] notasFinales = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            // Calcular la nota final como el promedio de las tres notas
            double notaFinal = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;

            // Determinar si el estudiante aprobó o reprobó
            if (notaFinal >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }

            // Guardar la nota final en el array
            notasFinales[i] = notaFinal;
        }

        return new Resultado(notasFinales, aprobados, reprobados);
    }

    /**
     * Clase para almacenar los resultados.
     */
    public static class Resultado {
        public double[] notasFinales;
        public int aprobados;
        public int reprobados;

        public Resultado(double[] notasFinales, int aprobados, int reprobados) {
            this.notasFinales = notasFinales;
            this.aprobados = aprobados;
            this.reprobados = reprobados;
        }
    }
}