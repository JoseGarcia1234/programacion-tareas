
package grados;
import java.util.Scanner;
public class GRADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         
        while(true){
        double grados;
       double resultado_grados = 0;
        
        
            
            
            System.out.println("selecciona a que quieres convertir:"); 
            
            System.out.println("1: fahrenheit");
            System.out.println("2: kelvin");
            
            System.out.println("3: Salir");
                
                int opcion = scanner.nextInt();
                
                if (opcion == 3) {
                    System.out.println("Saliendo");
                    break;
                }
            System.out.println("ingresa los grados que quieres convertir:");
            grados = scanner.nextDouble();
            
           
           
            
            switch(opcion){
                case 1: 
                    resultado_grados = grados * 9 / 5 + 32;
                    System.out.println("resultado:" +resultado_grados);
                
            
            
                case 2: 
                    resultado_grados = grados + 273.15;
                    System.out.println("resultado:" +resultado_grados);
            }
                }
            }
        }
