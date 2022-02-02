public class Voznja {
    public static void main(String[] args) {
        Automobil br1 = new Automobil("Pezo","308",1234567,"Marko Markovic");
        Automobil br2= new Automobil("Mercedes", "Malaysia", 7896578,"Ivan Ivanovic");
        System.out.println("Marka prvog automobila je: " +br1.getMarka());
        System.out.println("Model prvog automobila je: " + br1.getModel());
        System.out.println("Serijski broj prvog automobila je: " +br1.getSerijskiBroj());
        br1.setVlasnik("Stefan Markovic");
        System.out.println("Promenjeno ime vlasnika prvog automobila je: " + br1.getVlasnik());
        System.out.println();

        System.out.println("Marka drugog automobila je: "+ br2.getMarka());
        System.out.println("Model drugog automobila je: "+ br2.getModel());
        System.out.println("Serijski broj drugog automobila je: "+br2.getSerijskiBroj());
        br2.setVlasnik("Nemanja Ivanovic");
        System.out.println("Promenjeno ime vlasnika drugog automobila je: "+ br2.getVlasnik());
    }
}




