package Sintaksa1;/*
Napisati program koji ce racunati povrsinu okrecene prostorije,
 tako sto se ivice prostorije ucitavaju preko konzole.
 (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */

import java.util.Scanner;

public class Sintaksa1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Unesite duzinu ivice prvog zida: ");
        float duzinaPrvogZida = sc.nextFloat();
        System.out.println("Unesite sirinu ivice prvog zida: ");
        float sirinaPrvogZida = sc.nextFloat();
        System.out.println("Unesite duzinu ivice prvog zida: ");
        float duzinaDrugogZida = sc.nextFloat();
        System.out.println("Unesite sirinu ivice prvog zida: ");
        float sirinaDrugogZida = sc.nextFloat();
        float povrsina = 2 * (duzinaPrvogZida * sirinaPrvogZida + duzinaDrugogZida * sirinaDrugogZida);
        System.out.println("Ukupna povrsina iznosi: " +  povrsina);
    }
}
