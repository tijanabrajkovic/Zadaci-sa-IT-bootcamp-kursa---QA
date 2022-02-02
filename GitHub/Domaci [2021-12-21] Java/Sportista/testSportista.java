public class testSportista {
    public static void main(String[] args) {
        Sportista prvi = new Sportista("Milan Milanovic", "fudbal", "Partizan", 9);
        Sportista drugi = new Sportista("Jovan Joksimovic", "rukomet", "Sloboda", 5);
        Sportista treci= new Sportista("Petar Petrovic", "kosarka", "Radnicki", 10);

        System.out.println("Ime i prezime prvog sportiste je: " + prvi.getImeIPrezime());
        System.out.println("Vrsta sport kojim se bavi prvi sportista je: " + prvi.getSport());
        prvi.setKlub("Crvena Zvezda");
        System.out.println("Klub za koji igra prvi sportista je: " + prvi.getKlub());
        prvi.setBrojDresa(6);
        System.out.println("Broj dresa prvog sportiste je: " + prvi.getBrojDresa());
        System.out.println();
        System.out.println("Ime i prezime drugog sportiste je: " + drugi.getImeIPrezime());
        System.out.println("Vrsta sport kojim se bavi drugi sportista je: " + drugi.getSport());
        drugi.setKlub("Crvena Zvezda");
        System.out.println("Klub za koji igra drugi sportista je: " + drugi.getKlub());
        drugi.setBrojDresa(4);
        System.out.println("Broj dresa drugog sportiste je: " + drugi.getBrojDresa());
        System.out.println();
        System.out.println("Ime i prezime treceg sportiste je: " + treci.getImeIPrezime());
        System.out.println("Vrsta sport kojim se bavi treci sportista je: " + treci.getSport());
        treci.setKlub("Partizan");
        System.out.println("Klub za koji igra treci sportista je: " + treci.getKlub());
        treci.setBrojDresa(13);
        System.out.println("Broj dresa treceg sportiste je: " + treci.getBrojDresa());
    }
}
