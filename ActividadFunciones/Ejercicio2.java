package ActividadFunciones;
import java.util.Scanner;
public class Ejercicio2{
public static int calcular(int x,int y) {
    while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
    }
    return x;
}
public static void main(String[] args) {
    Scanner Leer=new Scanner(System.in);

        int x,y;
        System.out.println("Ingrese el primer digito: ");
        x=Leer.nextInt();
        System.out.println("Ingrese el segundo digito: ");
        y=Leer.nextInt();

        System.out.println("El MCD es: "+ calcular (x,y));


    }
    
}