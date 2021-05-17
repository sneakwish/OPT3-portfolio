package capoeira1;

import java.util.ArrayList;

public class Aanwezigheid {
    private ArrayList<Lid> lidLijst = new ArrayList<Lid>();
    private int getraind;
    private Boolean betaald;


    public int kosten(){
        if(getraind==1){
            System.out.println("1x in een week getraind. Kosten eind van de maand is: €25,-");
            return 25;
        }
        if(getraind>2){
            System.out.println("2x in een week getraind. Kosten eind van de maand is: €50,-");
            return 50;
        }
        if(getraind<1){
            System.out.println("0x in een week getraind. Kosten eind van de maand is: €0,-");
            return 0;
        }
        return 0;
    }

}
