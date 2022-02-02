package Loop;
/* 1. Aritmeticke opracije
Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim
tim redom.*/

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite vrednost za broj x:");
        int x= sc.nextInt();
        System.out.println("Unesite vrednost za broj y:");
        int y= sc.nextInt();
        System.out.println("Zbir x i y broja je:" + (x+y));
        System.out.println("Razlika x i y broja je:" + (x-y));
        System.out.println("Proizvod x i y broja je:" + (x*y));
        System.out.println("Kolicnik x i y broja je:" + (x/y));
        System.out.println("Ostatak pri deljenu x i y broja je:" + (x%y));


    }
}
