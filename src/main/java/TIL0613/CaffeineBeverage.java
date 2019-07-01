package TIL0613;

public abstract class CaffeineBeverage {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    abstract void brew();

    void pourInCup() {
        System.out.println("컵에 붓습니다.");
    }

    void boilWater() {
        System.out.println("물을 끓입니다.");
    }

}
