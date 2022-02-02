import java.util.Scanner;

public class PrviZadatak {
    /*
    Napisati funkciju koja racuna prosecnu vrednost double niza
     */
    public static void main(String[] args) {
        // Preko skenera unosim broj n koji oznacava koliko elemenata zelim da imam u nizu
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n= sc.nextInt();
        System.out.println("Unesite elemente u niz:");
        // Pravim niz koji ce da ima n elemenata
        double [] niz= new double[n];
        //Preko petlje prolazim kroz niz i preko skenera unosim svaki element niza
        for(int i=0; i<niz.length; i++){
            niz[i]= sc.nextInt();
        }
        System.out.println(prosecnaVrednostNiza(niz));

    }
    public static double prosecnaVrednostNiza(double [] niz){
        // Preko petlje prolazim kroz niz i izracunavam sumu svih elemenata
        double suma=0;
        for(int i=0;i<niz.length; i++){
            suma= suma+ niz[i];
        }
        //Dobijenu sumu delim sa duzinom niza kako bih dobila prosecnu vrednost niza
        double prosek= suma/niz.length;
        return prosek;
    }
}
