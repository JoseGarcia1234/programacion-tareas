/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialnumero;

/**
 *
 * @author Hazie
 */
import java.util.Scanner;
public class FACTORIALNUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer=new Scanner(System.in);
        int Num;
        long Factorial=1;

        System.out.println("DAME EL NUMERO");
        Num=Leer.nextInt();
        int i;
        for(i=1;i<=Num;i++){
            Factorial*=i;
        }
System.out.println("EL FACTORIAL DEL NUMERO ES: "+Factorial);
    }
    
}
