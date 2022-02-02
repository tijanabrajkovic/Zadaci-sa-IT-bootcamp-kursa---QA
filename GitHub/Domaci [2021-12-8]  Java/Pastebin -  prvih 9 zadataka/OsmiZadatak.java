import java.util.Scanner;
/*
8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati
	 jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
 */

public class OsmiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.next();
        System.out.println("Unesite prezime: ");
        String prezime = sc.next();
        System.out.println("Unesite godiste: ");
        int godiste = sc.nextInt();
        int godine = 2021 - godiste;
        if (godine - 6 <= 0) {
            System.out.println(ime+ " " + prezime + "tek treba da zapocne obrazovanje.");
        }
        else if (godine - 6 >= 13) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu!");
        }
        else {
            System.out.println(ime + " " + prezime + " ide u " + (godine - 6) + ". razred");
        }
    }
}


