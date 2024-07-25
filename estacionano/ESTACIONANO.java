/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionano;

/**
 *
 * @author Hazie
 */
 import java.util.Scanner;
public class ESTACIONANO {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
                Scanner scanner = new Scanner(System.in);
 
        int mes;
       
        System.out.println("ingrese un mes: (1-12)");
        mes = scanner.nextInt();

        
        String estacion;
        
        switch (mes) {
            case 1: System.out.println("enero"); 
            case 2: System.out.println("febrero");
            case 12: System.out.println("diciembre");
                estacion = "invierno";
                break;
            case 3: System.out.println("marzo");
            case 4: System.out.println("abril");
            case 5: System.out.println("mayo");
                estacion = "primavera";
                break;
            case 6:  System.out.println("junio");
            case 7:  System.out.println("julio");
            case 8:  System.out.println("agosto");
                estacion = "verano";
                break;
            case 9:  System.out.println("septiembre");
            case 10: System.out.println("octubre");
            case 11: System.out.println("noviembre");
                estacion = "otoño";
                break;
            default:
                estacion = "el mes no existe";
                break;
        }

       
        System.out.println("La estacion es: " + estacion);
}
}
    
    

