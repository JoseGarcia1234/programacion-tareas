package ActividadArrays;
import java.util.Scanner;
public class InvertirElementos{
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        int[]numero = new int[5];
        int suma = 0;
        int i = 0;
        System.out.println("Ingrese los numeros: ");
        for ( i = 0; i < 5; i++){
            numero[i] = texto.nextInt();
            suma+= numero[i];
        }
        System.out.println("La suma de los numeros es: " + suma);
    
        }
}
