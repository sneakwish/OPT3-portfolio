package Tests;

import capoeira1.Administratie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministratieTest {

    @Test
    void hoiTest() {
        Administratie yo = new Administratie();
        assertEquals("hoi", yo.hoi());
    }

}