package TIL1102;

/**
 * 현재 신문배달부는 고객에 대한 정보(책임)을 많이 가지고 있음
 */
public class PaperBoy {

    public void execute(Customer customer) {
        int payment = 10000;
        Wallet wallet = customer.getWallet();   //고객님 지갑 주세요

        if (wallet.getTotalMoney() >= payment) {    //지갑에 돈이 있는지 확인합니다.
            wallet.substractMoney(payment);         //지갑에서 돈을 빼가겠습니다.
            System.out.println("결제가 완료 되었습니다.");
        }
        else {
            System.out.println("돈이 부족합니다.");
        }
    }


}
