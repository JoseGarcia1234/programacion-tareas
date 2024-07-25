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
public class media {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;
        

        while (true) {
            
            System.out.println("ingresa numeros positivos:");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("la media de los numeros positivos ingresados es: " + media);
        } else {
            System.out.println("ingrestaste un numero negativo");
        }
    }
}

