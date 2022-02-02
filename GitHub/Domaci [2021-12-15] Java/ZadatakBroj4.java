import java.util.Scanner;

public class ZadatakBroj4 {
    /*
    Napisati funkciju koja racuna proizvod 3 broja.
Hint kako citati ove zadatke:
- ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
- funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(proizvodTriBroja(3,7,10));
    }
    public static int proizvodTriBroja (int a, int b, int c) {
        int proizvod = a * b * c;
        return proizvod;

    }
}
