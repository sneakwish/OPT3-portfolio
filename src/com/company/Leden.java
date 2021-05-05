package com.company;

public class Leden {
    private String naam;
    private int leeftijd;
    private String adres;
    private String postcode;

    public Leden(String naam, int leeftijd, String adres, String postcode) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;
        this.postcode = postcode;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
