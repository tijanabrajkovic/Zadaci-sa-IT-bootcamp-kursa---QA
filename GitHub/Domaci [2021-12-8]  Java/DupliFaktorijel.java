import java.util.Scanner;
/*
1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetog broja n. Dupli faktorijel broja n je:
n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

 */

public class DupliFaktorijel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite neki broj:");
            int n = sc.nextInt();
            int fact = 1;
            if (n % 2 == 0){
                for(int i = n; i >= 2; i -= 2){
                    fact *= i;
                }
            }
            else {
                for(int i = n; i >= 1; i -= 2){
                    fact *= i;
                }
            }
            System.out.println("Dupli faktorijel unetog broja je:");
            System.out.println(fact);
        }
    }
