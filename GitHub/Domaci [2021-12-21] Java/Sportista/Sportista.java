public class Sportista {
    private String imeIPrezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String imeIPrezime,String sport,String klub,int brojDresa) {
        this.imeIPrezime=imeIPrezime;
        this.sport=sport;
        this.klub=klub;
        this.brojDresa=brojDresa;
    }
    public String getImeIPrezime(){
        return imeIPrezime;
    }
    public String getSport(){
        return sport;
    }
    public String getKlub(){
        return klub;
    }
    public void setKlub(String klub){
        this.klub=klub;
    }
    public int getBrojDresa(){
        return brojDresa;
    }
    public void setBrojDresa(int brojDresa){
        this.brojDresa=brojDresa;
    }
}
