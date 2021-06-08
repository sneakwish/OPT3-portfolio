package capoeira1;

import java.util.Date;

public class Training {
    private Date datumTraining;

    public Training(Date datumTraining) {
        this.datumTraining = datumTraining;
    }

    public Date getDatum() {
        return datumTraining;
    }

    public void setDatum(Date datumTraining) {
        this.datumTraining = datumTraining;
    }
}
