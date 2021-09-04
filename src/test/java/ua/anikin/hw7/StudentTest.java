package ua.anikin.hw7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;

    @BeforeEach
    void setUp() {
        student1 = new Student("", "", "", 4);
        student2 = new Student("", "", "", 5);
        student3 = new Student("", "", "", 4.4);
        student4 = new Student("", "", "", 4.9);
    }

    @Test
    void testScholarshipIntegerNumbers() {
        assertEquals(80, student1.getScholarship());
        assertEquals(100, student2.getScholarship());
    }

    @Test
    void testScholarshipDoubleNumbers(){
        assertEquals(80,student3.getScholarship());
        assertEquals(80,student4.getScholarship());

    }
}
