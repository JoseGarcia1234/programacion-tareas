/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author Hazie
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);

        Double Peso;
        Double Altura;
        Double IMC;


        System.out.print("Ingrese su peso en kilogramos: ");
        Peso = Entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
         Altura = Entrada.nextDouble();

        IMC = Peso / (Altura * Altura);
        
        System.out.printf("Su IMC es: %.2f\n", IMC);

    }
    
}
