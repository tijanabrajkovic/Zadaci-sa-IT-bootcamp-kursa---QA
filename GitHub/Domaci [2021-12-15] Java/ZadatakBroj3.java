import java.util.Scanner;

public class ZadatakBroj3 {
    /*
    30. -//-. Izracunati proizvod elemenata tog niza.
Primer: [2, 4] -> 8
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n = sc.nextInt();
        int[] niz= new int[n];
        int proizvod= 1;
        for(int i=0; i<niz.length; i++) {
            System.out.println("Unesite element niza:");
            niz[i] = sc.nextInt();
            proizvod= proizvod * niz[i];
        }
        System.out.println("Proizvod je: " + proizvod);


    }
}
