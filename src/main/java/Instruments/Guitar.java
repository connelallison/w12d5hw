package Instruments;

public class Guitar extends AbstractInstrument {
    private int stringCount;

    public Guitar(String material, InstrumentType instrumentType, int buyingPrice, int sellingPrice, int stringCount) {
        super(material, instrumentType, buyingPrice, sellingPrice);
        this.stringCount = stringCount;
    }

    @Override
    public String play() {
        return "Twang";
    }

    public int getStringCount() {
        return stringCount;
    }
}
