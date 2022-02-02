import java.util.Scanner;

public class PrviZadatak {
    /*
    Omoguciti da korisnik unese n brojeva preko skenera i smestiti uh u niz. Ispisati svaki drugi element tog niza.
     */
    public static void main(String[] args) {
        // Unosim preko skenera broj n koji oznaca koliko elemena zelim da imam u nizu
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= sc.nextInt();
        // Pravim niz koji ce imati n unetih elemenata
        int [] nizBrojeva= new int[n];
        System.out.println("Unesite elemente u niz:");
        // Unosim svaki element niza preko petlje
        for(int i=0; i<nizBrojeva.length; i++) {
            nizBrojeva[i]= sc.nextInt();
        }
        //Ispisujem svaki drugi element prethodno unetog niza
        System.out.println("Novi niz je: ");
        for(int j=0; j<nizBrojeva.length; j+=2){
            System.out.println(nizBrojeva[j]);
        }
    }
}
