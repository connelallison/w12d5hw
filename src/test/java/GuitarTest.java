import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", InstrumentType.STRING, 2500, 4000, 8);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2500, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4000, guitar.getSellingPrice());
    }

    @Test
    public void hasStringCount() {
        assertEquals(8, guitar.getStringCount());
    }

    @Test
    public void canGetMarksup() {
        assertEquals(1500, guitar.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("Twang", guitar.play());
    }
}
