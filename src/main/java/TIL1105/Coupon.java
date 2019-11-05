package TIL1105;


public class Coupon {
    private double discountRate;

    public Coupon(double discountRate) {
        this.discountRate = discountRate;
    }

    public int calculateDiscountAmount(Item item) {
        if(item instanceof SpecialItem) {   //리스코프치환원칙 위배
            return 0;
        }
        return (int) (item.getPrice() * discountRate);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
