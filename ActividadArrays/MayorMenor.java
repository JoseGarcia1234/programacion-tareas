package ActividadArrays;
import java.util.Scanner;
public class MayorMenor{
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        int[] num1 = new int [10];
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i < 10; i++){
            num1[i] = texto.nextInt();

        }
        int Cp = 0;
        int Ci = 0;
        for (int i = 0; i < 10; i++){
            if(num1[i] % 2 == 0){
                Cp++;
            } else {
                Ci++;
            }
        }
        System.out.println("Los numeros pares son: " + Cp);
        System.out.println("Los numeros impares son: " + Ci);
    }

    public void myFuncion1(String argumento){
        
    }
}