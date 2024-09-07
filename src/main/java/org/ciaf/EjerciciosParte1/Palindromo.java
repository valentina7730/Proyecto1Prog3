package org.ciaf.EjerciciosParte1;

import java.util.Scanner;


public class Palindromo {
    public static boolean esPalindroma(String palabra){
        palabra = palabra.toLowerCase();
        palabra=palabra.replace(" ","");
        palabra=palabra.replace("á","a");
        palabra=palabra.replace("é","e");
        palabra=palabra.replace("í","i");
        palabra=palabra.replace("ó","o");
        palabra=palabra.replace("ú","u");


        int a=0;
        int b=palabra.length() -1;

        for(int i=0; i<palabra.length();i++){
            if (palabra.charAt(a)==palabra.charAt(b)){
                a++;
                b--;
            }
            else
                return false;
        }
        return true;



    }

    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("ingrese una palabra o frase");
        palabra= leer.nextLine();
        if (esPalindroma(palabra))
            System.out.println("es palindroma");
        else
            System.out.println("No es palindroma");



    }
}
