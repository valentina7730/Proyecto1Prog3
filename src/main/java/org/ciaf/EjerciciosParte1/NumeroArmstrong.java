package org.ciaf.EjerciciosParte1;
import java.util.Scanner;

public class NumeroArmstrong {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();
        scanner.close();




        System.out.println((isArmstrong(number)) ? "Is a Armstrong" : "Is not Armstrong");


    }
    private static boolean isArmstrong( int number){
        int temporay = number,digits=0, lastDigit=0, addition=0;
        digits=(int)(Math.log10(number)+1);
        temporay=number;
        while(temporay>0){
            lastDigit=temporay % 10;
            addition +=(Math.pow(lastDigit,digits));
            temporay=temporay/10;

        }
        if (number==addition)
            return true;
        else
            return false;
    }
}
