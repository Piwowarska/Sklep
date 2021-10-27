package pl.camp.it.shop.sale.model;

public class Shop {
    private String name;
    private int guantity;
    private int numer;
    private boolean kupiony;

    public Shop(String name, int guantity, int numer) {
        this.name = name;
        this.guantity = guantity;
        this.numer = numer;
        this.kupiony = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuantity() {
        return guantity;
    }

    public void setGuantity(int guantity) {
        this.guantity = guantity;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isKupiony() {
        return kupiony;
    }

    public void setKupiony(boolean kupiony) {
        this.kupiony = kupiony;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nazwa : " )
                .append( this.getName() )
                .append( "Ilość : " )
                .append( this.getGuantity() )
                .append( "Numer produktu : " )
                .append( this.getNumer() );

        // return sb.toString();


        if (!this.isKupiony()) {
            return sb.toString();
        }
        return "";

    }
}

