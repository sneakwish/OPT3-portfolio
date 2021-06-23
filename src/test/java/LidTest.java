package Tests;

import model.Lid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LidTest {
    static Lid lid1;

    @BeforeEach
    public void maakLid(){
        lid1 = new Lid("jan", 18, "Beverstraat 9", 063723325, true, "jan@gmail.com");
    }

    @Test
    public void TestGetNaam() {
        Assertions.assertEquals("jan", lid1.getNaam());

    }

    @Test
    void getLeeftijd() {
        Assertions.assertEquals(18, lid1.getLeeftijd());
    }

    @Test
    void getAdres() {
        Assertions.assertEquals("Beverstraat 9", lid1.getAdres());
    }

}