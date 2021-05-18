package Tests;

import capoeira1.Aanwezigheid;
import capoeira1.Lid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}