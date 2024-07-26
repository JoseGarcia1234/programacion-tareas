package ActividadFunciones;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero=texto.nextInt();

    falsoverdadero(numero);

    }

    public static void falsoverdadero(int a){
        if(a>0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    }

