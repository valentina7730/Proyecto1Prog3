package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class PiramideAsteriscos {

    public static void piramide(int n){
        int i,j,k;
        for (i=1;i<=n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas para la piramide ");
        int n = scanner.nextInt();
        piramide(n);


    }
}
