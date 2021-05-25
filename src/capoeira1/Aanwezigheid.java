package capoeira1;

import java.util.ArrayList;

public class Aanwezigheid {
    private ArrayList<Lid> lidLijst = new ArrayList<Lid>();
//    private int getraind;
    private Boolean betaald;
    private static int aanwezigen = 0;


    public int kosten(int getraind){
        if(getraind==1){
            System.out.println("1x in een week getraind. Kosten eind van de maand is: €25,-");
            return 25;
        }
        if(getraind>=2){
            System.out.println("Meer dan 2x in een week getraind. Kosten eind van de maand is: €50,-");
            return 50;
        }
        if(getraind<1){
            System.out.println("0x in een week getraind. Kosten eind van de maand is: €0,-");
            return 0;
        }
        return 0;
    }

    public Boolean toelating(Boolean mondkapje, Boolean gezond, int leeftijd){
        if (!mondkapje){
            System.out.println("Niet toegelaten! Neem een mondkapje mee.");
            return false;
        }
        if(!gezond){
            System.out.println("Niet toegelaten! Blijf thuis.");
            return false;
        }
        if (aanwezigen<20){
            if(leeftijd<18){
                System.out.println("Toegelaten! Je hoeft geen afstand te houden.");
                aanwezigen++;
                return true;
            }
            else if(leeftijd>=60){
                System.out.println("Je bent te oud!");
                aanwezigen++;
                return false;
            }
            else{
                System.out.println("Toegelaten! Je Moet afstand houden.");
                aanwezigen++;
                return true;
            }
        }
        else{
            System.out.println("Niet toegelaten! We zijn al met max. 20 man.");
            return false;
        }
    }

    public ArrayList<Lid> getLidLijst() {
        return lidLijst;
    }

    public void setLidLijst(ArrayList<Lid> lidLijst) {
        this.lidLijst = lidLijst;
    }

//    public int getGetraind() {
//        return getraind;
//    }
//
//    public void setGetraind(int getraind) {
//        this.getraind = getraind;
//    }

    public Boolean getBetaald() {
        return betaald;
    }

    public void setBetaald(Boolean betaald) {
        this.betaald = betaald;
    }

    public void setAanwezigen(int aanwezigen) {
        this.aanwezigen = aanwezigen;
    }
}
