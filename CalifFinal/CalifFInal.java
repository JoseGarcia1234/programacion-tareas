package CalifFinal;

import java.util.Scanner; 

public class CalifFInal { 

public static void main(String[] args) { 

Scanner Entrada= new Scanner(System.in); 

        Double PAR,PRO,EXAF,PROF; 

        System.out.println("DAME TU CALIFICACION DE PARCIALES (0-100)"); 

        PAR=Entrada.nextDouble(); 

        System.out.println("DAME TU CALIFICACION DE PROYECTO (0-100)"); 

        PRO=Entrada.nextDouble(); 

        System.out.println("DAME TU CALIFICACION DE EXAMEN FINAL "); 

        EXAF=Entrada.nextDouble(); 

        PROF=(PAR*0.40)+(EXAF*0.30)+(+PRO*0.30); 

        System.out.println("TU PROMEDIO FINAL ES DE: "+PROF); 
    }

} 