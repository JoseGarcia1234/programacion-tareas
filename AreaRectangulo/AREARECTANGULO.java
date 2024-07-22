package AreaRectangulo;
import java.util.Scanner;
public class AREARECTANGULO {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int Ancho;
        int Largo;
        int area;
 
        System.out.println("DAME EL LARGO DEL RECTANGULO");
        Largo=Entrada.nextInt();
        System.out.println("DAME EL ANCHO DEL RECTANGULO");
        Ancho=Entrada.nextInt();
        area=Ancho*Largo;
 
        System.out.println("EL AREA DEL RECTANGULO ES: "+ area);
 
 
 
 
 
 
     }
     
 }