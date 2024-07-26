package ActividadArrays;
import java.util.Scanner;
public class SumaElementos{
    public static void main (String[] args){
        Scanner texto = new Scanner (System.in);
        int[] numero = new int[6];
        System.out.println("Digite los numeros: ");
        for (int i = 0; i < 6; i++){
            numero[i] = texto.nextInt();
        }
        SumaElementos(numero);
        System.out.println("Array invertido: ");
        for (int i = 0; i< 10; i++){
            System.out.println(numero[i] + " ");
        }
    }

    public static void SumaElementos(int[] array) {
        int a;
        a = array.length;
        for (int i = 0; i< a / 2; i++) {
            int temp;
            temp = array[i];
            array[i] = array [a - 1 - i];
            array [a - 1 -i] = temp;
        }
    }
}
