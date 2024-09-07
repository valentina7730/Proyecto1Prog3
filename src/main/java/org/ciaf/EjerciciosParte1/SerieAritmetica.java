import java.util.Scanner;

public class SerieAritmetica {

    public static int calcularSuma(int n, int a, int d) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += a;
            a += d;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de términos (n): ");
        int n = leer.nextInt();
        System.out.print("Ingrese el primer término (a): ");
        int a = leer.nextInt();
        System.out.print("Ingrese la diferencia común (d): ");
        int d = leer.nextInt();

        int suma = calcularSuma(n, a, d);
        System.out.println("La suma de los primeros " + n + " términos es: " + suma);
    }
}