import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;


    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        guitar = new Guitar("wood", InstrumentType.STRING, 2500, 4000, 8);
        guitarStrings = new GuitarStrings("Strings for an 8 string guitar", 2, 10);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        assertEquals(0, shop.stockCount());
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        assertEquals(0, shop.stockCount());
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
        shop.addStock(guitarStrings);
        assertEquals(2, shop.stockCount());
        shop.removeStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(1508, shop.potentialProfit());
    }
}
