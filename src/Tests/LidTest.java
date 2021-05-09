package Tests;

import capoeira1.Lid;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LidTest {
    Lid lid1 = new Lid("jan", 18, "Beverstraat 9", "1996TG");

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

    @Test
    void getPostcode() {
        Assertions.assertEquals("1996TG", lid1.getPostcode());
    }
}