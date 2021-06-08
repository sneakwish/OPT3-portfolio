package capoeira1;

import java.util.Date;

public class Betalingen {
    private Date datumBetaald;

    public Betalingen(Date datumBetaald) {
        this.datumBetaald = datumBetaald;
    }

    public Date getDatumBetaald() {
        return datumBetaald;
    }

    public void setDatumBetaald(Date datumBetaald) {
        this.datumBetaald = datumBetaald;
    }
}
