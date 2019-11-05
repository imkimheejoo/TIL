package TIL1105;

public class Item {
    private int price;

    public Item(int price) {
        this.price = price;
    }

    public boolean isDiscountAvailable() {
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
