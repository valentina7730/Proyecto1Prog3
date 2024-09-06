package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class NumeroInvertido {


    public int cambiar(int numero){
        int res =0;
        while (numero>0){
            int digito = numero%10;
            res = (res*10) + digito;
            numero=numero/10;

        }
        return res;
    }
    public static void main(String[] args) {
        NumeroInvertido numeroInvertido = new NumeroInvertido();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero");
        int numero = scanner.nextInt();


        int res = numeroInvertido.cambiar(numero);
        System.out.println("El número invertido es: " + res);
    }


}
