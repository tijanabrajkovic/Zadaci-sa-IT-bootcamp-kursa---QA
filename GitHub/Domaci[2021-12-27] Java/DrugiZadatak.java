import java.util.ArrayList;

public class DrugiZadatak {
    /*
    2. Array liste
Kreirajte array listu nekog vaseg interesovanje (npr sport)
-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
-iz liste dohvatite 3. element liste i ispisite
-promenite naziv prvog elementa
-uklonite 5. element
-ispisite velicinu vase liste
-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
     */
    public static void main(String[] args) {
        ArrayList<String> ples= new ArrayList<>();
        ples.add("Salsa");
        ples.add("Bachata");
        ples.add("Rumba");
        ples.add("Son");
        ples.add("Kizomba");
        String elementNaPoziciji3= ples.get(2);
        System.out.println(elementNaPoziciji3);
        String promenjenNazivPrvogElementa=ples.set(0,"Samba");
        ples.remove(4);
        System.out.println("Niz je sada duzine: "+ ples.size());
        for(int i=0; i< ples.size();i++){
            System.out.println("Lista plesova: "+ ples.get(i));
        }
        for(String p:ples){
            System.out.println(p);
        }

        }
    }

