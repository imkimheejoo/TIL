package TIL0613;

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    //구상메서드 -> 이 메서드는 서브클래스에서 필요에 따라 오버라이드 할 수 있는 메소드
    // 후크(구상 메서드)가 있으면 서브클래스에서 메소드를 오버라이드 할수 있고 그냥 넘어갈 수 있음!
    boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    abstract void brew();

    private void boilWater() {
        System.out.println("물을 끓이는 중");
    }

    abstract void addCondiments();
}
