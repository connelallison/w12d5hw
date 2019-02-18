import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void setUp() throws Exception {
        guitarStrings = new GuitarStrings("Strings for an 8 string guitar", 2, 10);
    }

    @Test
    public void hasDescription() {
        assertEquals("Strings for an 8 string guitar", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2, guitarStrings.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10, guitarStrings.getSellingPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(8, guitarStrings.calculateMarkup());
    }

}
