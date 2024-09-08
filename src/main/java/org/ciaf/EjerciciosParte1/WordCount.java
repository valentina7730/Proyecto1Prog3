package org.ciaf.EjerciciosParte1;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();


        int wordCount = countWords(sentence);


        System.out.println("The sentence has " + wordCount + " words.");


        scanner.close();
    }


    public static int countWords(String sentence) {
        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            return 0;
        }

        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        return spaceCount + 1;
    }
}