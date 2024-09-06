import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n = sc.nextInt();
        int suma=0;
        for(int i=1; i<=n; i++){
            int auxiliar = n%i;

            if (auxiliar==0){
                suma = suma+1;

            }
        }
        if (suma <= 2){
            System.out.println("El numero es primo");

        }
        else{
            System.out.println("El numero no es primo");
        }
    }
}
