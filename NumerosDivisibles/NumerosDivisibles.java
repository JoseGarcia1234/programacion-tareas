public class NumerosDivisibles {

    public static void main(String[] args){
        System.out.println("Numeros divisbles por 3 y 5 entre 1 y 100: ");
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i% 5 == 0){
                System.out.println(i);
                
            }
        }
    }
}