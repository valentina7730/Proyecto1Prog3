package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class SumaDeNumerosPares {
    public static void main(String[]args){
        Scanner lector= new Scanner(System.in);
        System.out.println("cuantos numeros desea sumar: ");
        int numero;
        try{
            numero = lector.nextInt();
        } catch(Exception e){
            System.out.println("Error: ingrese un valor numerico");
            return;
        }
        System.out.println("el resultado de la suma de los primeros 1" + numero+ "positivos enteros pares es:"+ suma(numero));

    }
    public static int suma(int numero){
        int resultado=0;
        int numeroActual=2;

        do{
            resultado+= numeroActual;
            System.out.println(numeroActual+":"+resultado);
            numeroActual+=2;



        }while(numeroActual /2 <numero);
        return  resultado;
    }


}
