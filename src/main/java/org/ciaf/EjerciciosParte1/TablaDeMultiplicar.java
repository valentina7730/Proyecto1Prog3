package org.ciaf.EjerciciosParte1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla a consultar");
        int numero=scanner.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(numero+"*"+i+"="+(numero*i));
        }

    }
}
