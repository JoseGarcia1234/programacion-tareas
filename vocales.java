/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.trabajos1;

/**
 *
 * @author delga
 */
import java.util.Scanner;
public class vocales {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        char letra;
       
        while (true) {
             System.out.println("ingresa una letra:");
            
            letra = scanner.next().charAt(0);

            if (letra == ' ') {
                break;
            }

            if (esVocal(letra)) {
                System.out.println("es una vocal");
            } else if (Character.isLetter(letra)) {
                System.out.println("es una consonante");
            } else {
                System.out.println("no es una correcta");
            }
        }
    }

    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}

