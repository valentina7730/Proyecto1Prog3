package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class MinimoComoUnMultiplo {
    public static void main(String[]args){
        Scanner leer =new Scanner(System.in);
        int n1, n2, n3, i=2,mcm=1;
        System.out.println("ingrese el primer numero");
        n1= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n2= leer.nextInt();

        while(i <= n1 || i<=n2){
            if(n1%i == 0 || n2%i==0){
                if (n1%i==0){
                    n1=n1/i;
                }
                if(n2%i==0){
                    n2=n2/i;
                }
                mcm = mcm * i;
            }else {
                i++;
            }
        }
        System.out.println("El MCM es: "+mcm);


    }
}
