/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajos1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */


/**
 *
 * @author delga
 */
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true)
            
            {
                System.out.println("Seleccione la operacion: ");
                System.out.println("1: Suma");
                System.out.println("2: Resta");
                System.out.println("3: Multiplicacion");
                System.out.println("4: Division");
                        
                System.out.println("5: Salir");
                int opcion = scanner.nextInt();
                
                if (opcion == 5) {
                    System.out.println("Saliendo");
                    break;
                }
                
                double num1;
                double num2;
                
                
                System.out.println("Ingrese el primer numero: ");
                num1 = scanner.nextDouble();
                
                System.out.println("Ingrese el segundo numero: ");
                 num2 = scanner.nextDouble();
                
                double resultado = 0;
                
                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                    break;
                    case 2: 
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                    break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                    break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                            break;
                        } else {
                            System.out.println("Error");
                        }
               
                }
            }
        }
    }
}

