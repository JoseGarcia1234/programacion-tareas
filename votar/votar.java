
import java.util.Scanner; 

public class votar { 

public static void main(String[] args) { 

        Scanner Entrada= new Scanner(System.in); 

        int i=0; 

        int edad=0; 

        System.out.println("NOTA PARA VOTAR LA EDAD MINIMA ES DE 18 AÑOS"); 

        System.out.println("-----------------------------------------------"); 

        System.out.println("DAME TU EDAD:"); 

        edad= Entrada.nextInt(); 

        if(edad>=18){ 

            System.err.println("PUEDES VOTAR "); 

        }else{ 

            System.out.println("NO PUEDES VOTAR"); 

        } 

    } 

} 