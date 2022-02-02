/*
Napisati program koji proverava da li je uneti broj paran.
Ukoliko jeste, program treba da ispise poruku: Broj je paran!
Ukoliko nije, program treba da ispise poruku: Broj je neparan!
*/

package Sintaksa1;

import java.util.Scanner;

public class Grananja1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Unesite jedan broj: ");
        int broj = sc.nextInt();
        if (broj == 0) {
            System.out.println("Deljenje nulom nije moguce!");
        }
        else if (broj % 2 == 0) {
            System.out.println("Broj je paran!");
        }
        else {
            System.out.println("Broj je neparan!");
        }
    }
}
