import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u) {
        for (int i = 0; i < u.getOcene().size(); i++) {
            System.out.println(u.getOcene().get(i));
        }
    }

    public void pogledajOcene(int i) {
        Ucenik u = dnevnik.get(i);
        for (int j = 0; j < u.getOcene().size(); j++) {
            System.out.println(u.getOcene().get(j));
        }
    }

    public void prosecnaOcena(Ucenik u) {
        double suma = 0;
        for (int i = 0; i < u.getOcene().size(); i++) {
            suma = suma + u.getOcene().get(i);
        }
        double prosek = suma / u.getOcene().size();
        System.out.println(prosek);
    }

    public void prosecnaOcena(int i) {
        Ucenik u = dnevnik.get(i);
        double suma = 0;
        for (int j = 0; j < u.getOcene().size(); j++) {
            suma = suma + u.getOcene().get(j);
        }
        double prosek = suma / u.getOcene().size();
        System.out.println(prosek);
    }
}



