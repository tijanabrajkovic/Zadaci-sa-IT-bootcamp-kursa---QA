package Loop;
/* 2. FizzBuzz
Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku
"FizzBuzz" ako je on deljiv i sa 3 i sa 5.*/

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost za broj n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5==0) {
                System.out.println(i+":" + "FizzBuzz");
            }
            else if(i % 3==0) {
                System.out.println(i+ ":" +"Fizz");
            }
            else if(i % 5==0) {
                System.out.println(i+ ":" +"Buzz");
            }
            else if (i!=3 && i!=5) {
                System.out.println(i+ ":" +" ");
            }
        }
    }
}
