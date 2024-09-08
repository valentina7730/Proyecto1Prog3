package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class AverageOfaNumber {

    public static void main (String[]args){
        Scanner entrance = new Scanner(System.in);


        int n;
        double additio=0;
        int  qualification;
        double average;

        System.out.println("enter the number of grades to average");

        n=entrance.nextInt();

        for (int i=1; i<= n; i++){
            qualification=entrance.nextInt();
            additio=additio+qualification;
        }

        average=additio/n;
        System.out.println("the average is: "+average);

    }
}
