package TIL0613;

public class Main2 {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n차 준비중...");
        teaHook.prepareRecipe();
        System.out.println("\n커피 준비중...");
        coffeeHook.prepareRecipe();
    }
}
