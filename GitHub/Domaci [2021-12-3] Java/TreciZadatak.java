package Loop;
/* 3. Faktorijel
Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 * 2 * 1 = 6*/
import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti pozitivan ceo broj:");
        int n= sc.nextInt();
        int fact = 1;
        System.out.println("Faktorijel unetog broja je:");
        for (int i = 1; i <= n ; i++) {
            fact = fact * i ;
        }
        System.out.println(fact);
    }
}
