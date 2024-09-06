package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class MaximoComoUnDivisor {


    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.println("ingrese el primer numero");
        a= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        b= leer.nextInt();
        System.out.println("El MCD es: "+MCD(a,b));





    }
    public static int MCD(int a, int b){
        int aux;
        while (b!=0){
            aux=b;
            b=a%aux;
            a=aux;
        }
        return a;
    }

}
