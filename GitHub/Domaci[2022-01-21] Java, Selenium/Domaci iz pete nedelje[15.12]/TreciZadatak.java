import java.util.Scanner;

public class TreciZadatak {
    /*
    Izracunati proizvod elemenata niza
     */
    public static void main(String[] args) {
        // Preko skenera unosim broj n koji oznacava koliko elemenata zelim da imam u nizu
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= sc.nextInt();
        // Pravim niz koji ima ce da ima n unetih elemenata
        int [] niz= new int[n];
        //Unosim preko skenera svaki element niza i izracunavam proizvod svih elemenata u nizu
        System.out.println("Unesite elemente niza:");
        int proizvod=1;
        for(int i=0; i< niz.length; i++){
            niz[i]= sc.nextInt();
            proizvod= proizvod*niz[i];
        }
        System.out.println(proizvod);

    }

}
