import java.util.ArrayList;

    public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene){
        this.ime=ime;
        this.prezime=prezime;
        this.ocene=ocene;
    }
    public Ucenik(String ime, String prezime) {
        this.ime=ime;
        this.prezime=prezime;
        this.ocene= new ArrayList<Integer>();
    }

        public String getIme() {
            return ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public ArrayList<Integer> getOcene() {
            return ocene;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public void setOcene(ArrayList<Integer> ocene) {
            this.ocene = ocene;
        }
        public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ");
        sb.append("ima ocene: ");
        sb.append(ocene);
        return sb.toString();
        }
        public double prosek(ArrayList<Integer> ocene){
        int suma=0;
        for(int i=0; i< ocene.size(); i++) {
            suma=suma+ocene.get(i);
        }
        double prosekOcena=suma/ocene.size();
        return prosekOcena;
        }
    }

