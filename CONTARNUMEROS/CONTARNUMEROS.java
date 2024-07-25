/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarnumeros;

import java.util.Scanner;

/**
 *
 * @author Hazie
 */
public class CONTARNUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        int cantidad = scanner.nextInt();
        
        int mayoresCero = 0, menoresCero = 0, igualesCero = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("Números mayores que 0: " + mayoresCero);
        System.out.println("Números menores que 0: " + menoresCero);
        System.out.println("Números iguales a 0: " + igualesCero);
    }
}
    
