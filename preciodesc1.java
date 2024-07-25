/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciodesc;

/**
 *
 * @author Hazie
 */
import java.util.Scanner;
public class preciodesc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);

        double Precio,Des1,Des2,Des3;

        System.out.println("DAME EL PRECIO DE LA COMPRA");
        Precio=Entrada.nextDouble();

        if(Precio<100){
            System.out.println("EL PRECIO ES: "+Precio);
            System.out.println("EL PRECIO DE LA COMPRA NO TIENE DESCUENTO");
        }else if(Precio>100&& Precio<=200){
            System.out.println("EL PRECIO ES: "+Precio);
            Des1=Precio*0.100;
            System.out.println("EL DESCEUNTO ES: "+Des1);
            Precio=Precio-Des1;
            System.out.println("EL PRECIO DE LA COMPRA CON DESCUENTO ES: "+Precio);
        }else if(Precio>200&& Precio<=500){
            System.out.println("EL PRECIO ES: "+Precio);
            Des1=Precio*0.200;
            System.out.println("EL DESCEUNTO ES: "+Des1);
            Precio=Precio-Des1;
            System.out.println("EL PRECIO DE LA COMPRA CON DESCUENTO ES: "+Precio);
    }else if(Precio>500){
        System.out.println("EL PRECIO ES: "+Precio);
            Des1=Precio*0.250;
            System.out.println("EL DESCEUNTO ES: "+Des1);
            Precio=Precio-Des1;
            System.out.println("EL PRECIO DE LA COMPRA CON DESCUENTO ES: "+Precio);
    }
    
}
}