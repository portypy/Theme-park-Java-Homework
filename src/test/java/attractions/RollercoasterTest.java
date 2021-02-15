package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(11,144.00, 8.30);
        visitor1 = new Visitor(21,202.00, 28.30);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForTall() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void allowsVisitorsOver145() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void doesNotAllowVisitorsUnder145() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
}

