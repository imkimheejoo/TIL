package TIL1105;

/**
 * 무조건 할인을 해주지 않는 ITEM
 */
public class SpecialItem extends Item {

    public SpecialItem(int price) {
        super(price);
    }

    @Override
    public boolean isDiscountAvailable() {
        return false;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }
}
