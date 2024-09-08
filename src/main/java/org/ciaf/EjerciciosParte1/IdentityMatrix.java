package org.ciaf.EjerciciosParte1;

public class IdentityMatrix {
    public static void printIdentityMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        System.out.println("The identity matrix of size " + size + " is:");
        printIdentityMatrix(size);
        scanner.close();
    }
}
