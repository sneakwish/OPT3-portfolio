package model;

import java.util.ArrayList;

public class Administratie {
    private ArrayList<Lid> lidLijst = new ArrayList<Lid>();
    private Boolean heeftGetraind;
    private Boolean betaald;


    public int melding(Lid lid){
        if(heeftGetraind && lid.getIsLid() && !betaald){
            System.out.println("jan heeft getraind en niet betaald: Niet OK!");
            return 1;
        }
        if(heeftGetraind && lid.getIsLid() && betaald){
            System.out.println("jan heeft getraind en betaald: OK!");
            return 2;
        }
        else {
            System.out.println("jan is niet lid dus hoeft (nog) niet te betalen");
            return 0;
        }
    }

    public ArrayList<Lid> getLidLijst() {
        return lidLijst;
    }

    public void setLidLijst(ArrayList<Lid> lidLijst) {
        this.lidLijst = lidLijst;
    }

    public Boolean getHeeftGetraind() {
        return heeftGetraind;
    }

    public void setHeeftGetraind(Boolean heeftGetraind) {
        this.heeftGetraind = heeftGetraind;
    }

    public Boolean getBetaald() {
        return betaald;
    }

    public void setBetaald(Boolean betaald) {
        this.betaald = betaald;
    }
}
