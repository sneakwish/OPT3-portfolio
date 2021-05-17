package capoeira1;

public class Lid {
    private String naam;
    private int leeftijd;
    private String adres;
    private int telefoon;
    private Boolean isLid;
    private String email;

    public Lid(String naam, int leeftijd, String adres, int telefoon, Boolean isLid, String email) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
        this.telefoon = telefoon;
        this.isLid = isLid;
        this.email = email;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(int telefoon) {
        this.telefoon = telefoon;
    }

    public Boolean getIsLid() {
        return isLid;
    }

    public void setIsLid(Boolean lid) {
        isLid = lid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
