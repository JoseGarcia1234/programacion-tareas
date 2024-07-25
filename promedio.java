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
public class promedio {
    
    


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
   double numero1;
   double numero2;
   double numero3;
   double promedio;
            
            System.out.println("Ingrese el primer numero: ");
            numero1 = entrada.nextDouble();
            
            System.out.println("Ingrese el segundo numero: ");
            numero2 = entrada.nextDouble();
            
            System.out.println("Ingrese el tercer numero: ");
            numero3 = entrada.nextDouble();
            
            promedio = (numero1 + numero2 + numero3) / 3;
            
            System.out.println("El promedio de los tres numeros es: " + promedio);
        }
    }

