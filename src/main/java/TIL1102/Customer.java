package TIL1102;

public class Customer {
    private Wallet wallet;

    public Wallet getWallet() {
        return wallet;
    }

    public int calculate(int payment) {
        if(wallet == null) {
            throw new NotEnoughMoneyException();
        }
        if (wallet.getTotalMoney() >= payment) {
            wallet.substractMoney(payment);
            return payment;
        }
        else {
            throw new NotEnoughMoneyException();
        }

    }
}
