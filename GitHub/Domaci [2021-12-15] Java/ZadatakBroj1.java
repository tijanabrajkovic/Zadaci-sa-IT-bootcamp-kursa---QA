import java.util.Scanner;

public class ZadatakBroj1 {
    /*
    27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
Primer: [1, 2, 3, 4, 5] -> 1 3 5
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
        for(int j=0; j<niz.length; j= j+2) {
            System.out.print(niz[j]);
        }
    }
}
