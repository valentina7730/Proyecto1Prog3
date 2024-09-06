package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantos numero desea generar");
        int n = leer.nextInt();
        int f=0;
        int t1 =1;
        int t2;
        for (int i=1; i <= n; i++){
            t2=f;
            f= t1 + f;
            t1=t2;
            System.out.println(t1);

        }




    }
}
