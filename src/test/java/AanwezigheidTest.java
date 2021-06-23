package Tests;

import model.Aanwezigheid;
import model.Lid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AanwezigheidTest {

    static Lid lid1;

    @BeforeEach
    public void maakLid(){
         lid1 = new Lid("jan", 18, "Verstraat 9", 063723325, true, "jan@gmail.com");

    }

    @Test
    void kostenTest() {
        Aanwezigheid aan1 = new Aanwezigheid();
        Assertions.assertEquals(0, aan1.kosten(0));
        Assertions.assertEquals(25, aan1.kosten(1));
        Assertions.assertEquals(50, aan1.kosten(2));
        Assertions.assertEquals(50, aan1.kosten(3));
        Assertions.assertEquals(50, aan1.kosten(4));
        Assertions.assertEquals(50, aan1.kosten(5));
    }

    @Test
    void toelatingTest(){
        Aanwezigheid aan2 = new Aanwezigheid();
        aan2.setAanwezigen(5);
        Assertions.assertEquals(false, aan2.toelating(false, false, 17));
        Assertions.assertEquals(false, aan2.toelating(true, false, 17));
        Assertions.assertEquals(true, aan2.toelating(true, true, 17));
        Assertions.assertEquals(true, aan2.toelating(true, true, 19));
        Assertions.assertEquals(false, aan2.toelating(true, true, 80));
        aan2.setAanwezigen(20);
        Assertions.assertEquals(false, aan2.toelating(true, true, 21));

    }
}