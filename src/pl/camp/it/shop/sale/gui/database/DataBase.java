package pl.camp.it.shop.sale.gui.database;

import pl.camp.it.shop.sale.model.Shop;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private List<Shop> shop = new ArrayList<>(6);

    public DataBase() {
        this.shop.add(new Shop("Bluzka", 12, 1));
        this.shop.add( new Shop("Marynarka",  5, 2));
        this.shop.add( new Shop("Spodnie",  7, 3));
        this.shop.add( new Shop("Spodnica",  2, 4));
        this.shop.add( new Shop("Buty",  4, 5));
        this.shop.add( new Shop("Koszula",  9, 6));

    }

    public Shop kupProdukt(int numer) {
        Shop shop = this.findNumerProduktu(numer);
        if (shop== null || shop.getGuantity() == 0) {
            return null;
        } else {
            return shop;

        }
    }
        public Shop findNumerProduktu ( int numer){
            for (Shop produkt : this.shop) {
                if (produkt.getNumer() == numer) {
                    return produkt;
                }
            }
            return null;

        }
        public List<Shop> getShop () {
            return shop;
        }
    }


