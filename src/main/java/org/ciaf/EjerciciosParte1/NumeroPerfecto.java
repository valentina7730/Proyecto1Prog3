package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class NumeroPerfecto {


    public static boolean esPerfecto(int n){
        int i, suma=1;
        for(i=2;i<n;i++){
            if (n%i==0){
                suma+=i;
            }
        }
        if (suma==n){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[]args){
        int num;

        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        if (esPerfecto(num)){
            System.out.println("El numero "+num+" es perfecto");

        }else
        {
            System.out.println("El numero  "+num+" no es perfecto");

        }


    }
}
