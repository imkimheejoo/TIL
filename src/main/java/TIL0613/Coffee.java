package TIL0613;

public class Coffee extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 넣습니다.");
    }

    @Override
    void brew() {
        System.out.println("커피를 우려냅니다.");
    }
}
