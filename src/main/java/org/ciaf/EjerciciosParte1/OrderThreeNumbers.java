package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class OrderThreeNumbers {
    public static void main(String[]args){

        int a, b, c;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("first number");
        a=keyboard.nextInt();


        System.out.println("second number");
        b=keyboard.nextInt();


        System.out.println("third number");
        c=keyboard.nextInt();
        System.out.println("The numbers ordered from greatest to least are: ");

        if (a>=b && b>=c){
            System.out.println(" "+a+" "+b+" "+c+" ");
        }
        else if (a>=c && c>=b){
            System.out.println(" "+a+" "+c+" "+b+" ");

        }
        else if (b>=a && a>=c)
        {
            System.out.println(" "+b+" "+a+" "+c+" ");

        }
        else if (b>=c && c>=a)
        {
            System.out.println(" "+b+" "+c+" "+a+" ");
        }
        else
        {
            System.out.println(" "+c+" "+b+" "+a+" ");
        }

    }
}
