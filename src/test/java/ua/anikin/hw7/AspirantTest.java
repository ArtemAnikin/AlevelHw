package ua.anikin.hw7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AspirantTest {
    private Aspirant aspirant1;
    private Aspirant aspirant2;
    private Aspirant aspirant3;
    private Aspirant aspirant4;

    @BeforeEach
    void setUp() {
        aspirant1 = new Aspirant("", "", "", 4,"");
        aspirant2 = new Aspirant("", "", "", 5,"");
        aspirant3 = new Aspirant("", "", "", 4.1,"");
        aspirant4 = new Aspirant("", "", "", 4.9,"");

    }

    @Test
    void testScholarshipIntegerNumbers() {
        assertEquals(180, aspirant1.getScholarship());
        assertEquals(200, aspirant2.getScholarship());

    }

    @Test
    void testScholarshipDoubleNumbers(){
        assertEquals(180, aspirant3.getScholarship());
        assertEquals(180, aspirant4.getScholarship());

    }
}
