package Tests;

import capoeira1.Administratie;
import capoeira1.Lid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratieTest {
    static Lid lid1;

    @BeforeEach
    public void maakLid(){
        lid1 = new Lid("jan", 18, "Verstraat 9", 063723325, true, "jan@gmail.com");
    }

    @Test
    void meldinTest1() {
        Administratie ad = new Administratie();
        ad.setHeeftGetraind(true);
        ad.setBetaald(false);
        Assertions.assertEquals(1, ad.melding(lid1));
    }

    @Test
    void meldinTest2() {
        Administratie ad = new Administratie();
        ad.setHeeftGetraind(true);
        ad.setBetaald(true);
        Assertions.assertEquals(2, ad.melding(lid1));
    }

    @Test
    void meldinTest3() {
        Administratie ad = new Administratie();
        ad.setHeeftGetraind(true);
        ad.setBetaald(true);
        lid1.setIsLid(false);
        Assertions.assertEquals(0, ad.melding(lid1));
    }
}