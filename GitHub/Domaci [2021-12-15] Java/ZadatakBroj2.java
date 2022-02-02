import java.util.Scanner;

public class ZadatakBroj2 {
    /*
    29. -//-. Ispisati svaki treci element u obrnutom redosledu.
Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n= sc.nextInt();
        System.out.println("Unesite elemente niza:");
        int [] niz = new int[n];
        int i=0;
        while(i<n) {
            niz[i] = sc.nextInt();
            i++;
        }
        for(int j=n-1; j>=0; j=j-3) {
            System.out.println(niz[j]);
        }

    }
}
