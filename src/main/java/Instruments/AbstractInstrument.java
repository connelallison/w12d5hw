package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class AbstractInstrument implements IPlay, ISell {
    private String material;
    private InstrumentType instrumentType;
    int buyingPrice;
    int sellingPrice;

    public AbstractInstrument(String material, InstrumentType instrumentType, int buyingPrice, int sellingPrice) {
        this.material = material;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public String play() {
        return null;
    }
}
