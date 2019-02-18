import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public int potentialProfit(){
        int potentialProfit = 0;
        for (int i = 0; i < stock.size(); i++) {
            potentialProfit += stock.get(i).calculateMarkup();
        }
        return potentialProfit;
    }
}
