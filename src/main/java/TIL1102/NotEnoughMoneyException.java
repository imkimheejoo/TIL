package TIL1102;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("돈이 충분하지 않습니다.");
    }
}
