import java.util.Scanner;

public class DrugiZadatak {
    /*
    Ispisati svaki treci element niza u obrnutom redosledu
     */
    public static void main(String[] args) {
        //  Unosim preko skenera broj n koji oznaca koliko elemena zelim da imam u nizu
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= sc.nextInt();
        // Pravim niz koji ce imati n unetih elemenata
        int [] niz= new int[n];
        System.out.println("Unesite elemente niza:");
        // Unosim svaki element niza preko skenera
        for(int i=0;i< niz.length; i++){
            niz[i]= sc.nextInt();
        }
        // Ispisujem elemente prethodno unetog niza u obrnutom redosledu
        System.out.println("Novi niz je:");
        for(int j= niz.length-1; j>=0; j--){
            System.out.println(niz[j]);
        }
    }
}
