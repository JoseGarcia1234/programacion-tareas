package ActividadArrays;
import java.util.Scanner;

public class ContarNumeros {
    public static void main (String[] args) {
        Scanner texto = new Scanner (System.in);
        int[] numeros = new int [8]; 
        System.out.println("Ingresa los numeros deseados: ");
        for (int i = 0; i < 8; i++){
            numeros[1] = texto.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros [0];
        for (int i = 0; i < 8; i++){
            if ( numeros[i]>mayor){
                mayor = numeros [i];
            } if (numeros[i]> menor) {
                menor = numeros [i];
            }
        }
        
        System.out.println("El numero mas grande es: " + mayor);
        System.out.println("El numero mas chico es: " + menor);
    } 
}