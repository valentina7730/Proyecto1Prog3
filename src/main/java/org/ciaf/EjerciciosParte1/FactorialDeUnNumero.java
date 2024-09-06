package org.ciaf.EjerciciosParte1;


import java.util.Scanner;

public class FactorialDeUnNumero {

    public static void main(String[]args){
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int n =leer.nextInt();
        if (n<0){
            System.out.println("El factorial no se puede calcular");
        }
        else {
            calcular(n);
        }
    }
    public static void calcular(int n){
        int f=1;

        for(int i = 1; i<=n; i++){
            f=f*i;
        }
        System.out.println("El factorial de " +n+ "es: "+f);
    }
}
