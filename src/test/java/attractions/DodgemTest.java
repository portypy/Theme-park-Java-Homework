package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(11,144.00, 8.30);
        visitor1 = new Visitor(21,202.00, 28.30);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }
    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasHalfPriceForKids() {
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }
}
