/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contara;

/**
 *
 * @author Hazie
 */
import java.util.Scanner;
public class CONTARA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Leer = new Scanner(System.in);
        
        String Palabra;
        
        System.out.println("ESCRIBE TU PALABRA: ");
        Palabra= Leer.nextLine();
        int i;
        int contador =0;
        for(i=0;i<Palabra.length();i++){
            if(Palabra.charAt(i)=='A' ||Palabra.charAt(i)=='a'){//OR ES|| En javascript aqui hace que mientras o compare si hay 'A' or 'a';
                contador++;
            }
        }
        System.out.println("LAS LETRAS A SON: "+contador+"  LA PALABRA ES: "+Palabra);
        }
        
    }
    

