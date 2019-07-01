package TIL0529;

public enum LottoNumber {

    MIN(1), MAX(45);
    final private int number;

    private LottoNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
