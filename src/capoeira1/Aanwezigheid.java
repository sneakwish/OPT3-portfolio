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

    public String toelating(Boolean mondkapje, Boolean gezond, int leeftijd){
        if (!mondkapje){
            return "Niet toegelaten!";
        }
        if(!gezond){
            return "Niet toegelaten!";
        }

        if (aanwezigen<20){
            if(leeftijd<18){
                return "Toegelaten!";
                aanwezigen++;
            }
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

}
