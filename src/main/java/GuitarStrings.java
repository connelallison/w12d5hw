import Behaviours.ISell;

public class GuitarStrings implements ISell {
    private String description;
    private int buyingPrice;
    private int sellingPrice;

    public GuitarStrings(String description, int buyingPrice, int sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
