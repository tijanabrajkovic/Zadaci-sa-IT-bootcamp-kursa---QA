public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumac(String ime,String prezime, char pol, int godine, double ocena, boolean daLiJeIzSrbije) {
        this.ime=ime;
        this.prezime=prezime;
        this.pol=pol;
        this.godine=godine;
        this.ocena=ocena;
        this.daLiJeIzSrbije=daLiJeIzSrbije;
    }
    public String getIme(){
        return ime;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public char getPol(){
        return pol;
    }
    public void setPol(char pol){
        this.pol=pol;
    }
    public int getGodine(){
        return godine;
    }
    public void setGodine(int godine){
        this.godine=godine;
    }
    public double getOcena(){
        return ocena;
    }
    public void setOcena(int ocena){
        this.ocena=ocena;
    }
    public boolean getdaLiJeIzSrbije (){
        return daLiJeIzSrbije;
    }
    public void setDaLiJeIzSrbije(boolean daLiJeIzSrbije){
        this.daLiJeIzSrbije=daLiJeIzSrbije;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Ime glumca/e je: ");
        sb.append(ime);
        sb.append("\n");
        sb.append("Prezime glumca/e je: ");
        sb.append(prezime);
        sb.append("\n");
        sb.append("Pol: ");
        sb.append(pol);
        sb.append("\n");
        sb.append("Godine: ");
        sb.append(godine);
        sb.append("\n");
        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");
        sb.append("Da li je iz Srbije? ");
        if(daLiJeIzSrbije==false){
            sb.append("Glumac/ica nije iz Srbije.");
        }
        else {
            sb.append("Glumac/ica je iz Srbije.");
        }
        return sb.toString();


    }
}

