import java.util.Scanner;
/*
2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].
 */
public class SumaIntervala {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost broja m:");
        int m = sc.nextInt();
        System.out.println("Unesite vrednost broja n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++){
            sum += i;
        }
        System.out.println("Suma brojeva [m,n] je: ");
        System.out.println(sum);
    }
}

