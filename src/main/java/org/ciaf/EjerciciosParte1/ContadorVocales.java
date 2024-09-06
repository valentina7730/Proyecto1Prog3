package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        String cadena;
        int count = 0;

        System.out.println("ingrese una frase");
        cadena=leer.nextLine();

        for(int i=0;i<cadena.length();i++){
            char letra= Character.toLowerCase(cadena.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                count++;
            }
        }
        System.out.println("La cantidad de vocales en la frase es: "+count);

    }
}
