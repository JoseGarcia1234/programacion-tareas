/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacionconletras;

/**
 *
 * @author Hazie
 */
import java.util.Scanner;
public class calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here

        Scanner Entrada= new Scanner(System.in);

        Double CAL;

        System.out.println("DAME TU CALIFICACION (100-0)");
        CAL=Entrada.nextDouble();
        if(CAL>=90&& CAL<=100){
            System.out.println("A(100-90)   "+"TU CALIFICACION ES: "+CAL);
        }else if(CAL>=80&& CAL<=89){
            System.out.println("B(89-80)   "+"TU CALIFICACION ES: "+CAL);
        }else if(CAL>=70&& CAL<=79){
            System.out.println("C(79-70)"+"TU CALIFICACION ES: "+CAL);
        }else if(CAL>=60&& CAL<=69){
            System.out.println("C(69-60)"+"TU CALIFICACION ES: "+CAL);
        }else if(CAL<=60){
            System.out.println("D(60-0)"+"TU CALIFICACION ES: "+CAL);
        }

    }
    
}
