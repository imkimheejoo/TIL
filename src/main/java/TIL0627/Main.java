package TIL0627;

public class Main {
    public static void main(String[] args) {
        Calculation addition = (x, y) -> x + y;
        Calculation subtraction = (x, y) -> x - y;
        System.out.println(addition.apply(2, 1));
        System.out.println(subtraction.apply(2, 1));
    }
}
