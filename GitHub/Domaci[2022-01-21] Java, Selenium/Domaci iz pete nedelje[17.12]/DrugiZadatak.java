import java.util.Scanner;

public class DrugiZadatak {
    /*
    Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar"
     */
    public static void main(String[] args) {
        // Pravim niz niski imena i prosledjujem ga u funkciju
        String [] niz = {"Ivan", "Marko", "Petar"};
        // Ispisujem funkciju sa prosledjenim nizom
        System.out.println(daLiUNizuPostojiImeMarijaIliPetar(niz));


    }

    public static boolean daLiUNizuPostojiImeMarijaIliPetar(String[] nizImena) {
        //Proveram da li u nizu prostoji element cija je vrednost "Marija" ili "Petar"
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nizImena.length; i++) {
            String ime = nizImena[i];
            if (ime.equalsIgnoreCase("Marija") || ime.equalsIgnoreCase("Petar")) {
                // Ako postoji vraca se vrednost true
                return true;
            }
        }       // Ako ne postoji vratice se false
                return false;
        }
    }

