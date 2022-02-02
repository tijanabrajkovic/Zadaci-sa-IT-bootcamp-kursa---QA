public class CetvrtiZadatak {
    /*
     Napisati funkciju koja racuna proizvod tri broja;
     */
    public static void main(String[] args) {
        //Pozivam metodu prozivodTriBroja i unosim vrednosti promenljivih a u konzoli se ispisuje njihov proizvod
        System.out.println(proizvodTriBroja(1,2,3));

    }
    // Pravim metodu koja izracunava proizvod tri broja, kao argumente uzima tri promenljive a vraca promenjivu proizvod
    public static int proizvodTriBroja(int x, int y, int z){
        int proizvod=x*y*z;
        return proizvod;
    }
}
