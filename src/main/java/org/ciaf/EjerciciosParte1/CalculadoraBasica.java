package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[]args){
        Scanner operacion=new Scanner(System.in);

        int numero1,numero2,opcion;
        System.out.println("ingrese un numero");
        numero1=operacion.nextInt();
        System.out.println("ingrese otro numero");
        numero2=operacion.nextInt();
        do {
            System.out.println("1.-sumar");
            System.out.println("2.-restar");
            System.out.println("3.-multiplicar");
            System.out.println("4.-dividir");
            System.out.println("5.-salir");

            System.out.println("ingrese una opcion");
            opcion=operacion.nextInt();

        }
        while(opcion<1 || opcion>4);
        switch (opcion){
            case 1:
                System.out.println(numero1+numero2);

                break;
            case 2:
                System.out.println(numero1-numero2);
                break;
            case 3:
                System.out.println(numero1*numero2);
                break;
            case 4:
                System.out.println(numero1/numero2);
                break;
            case 5: System.exit(0);
                break;
            default:
                System.out.println("Gracias");
        }




    }
}
