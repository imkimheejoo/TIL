package TIL0708;

import java.util.function.IntPredicate;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Main3 {
    public static void main(String[] args) {
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000)); //Integer 로 박싱 없음

        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
        System.out.println(oddNumbers.test(1000));  // Predicate 는 참조형만 가능 해서 1000이라는 숫자는 Integer로 박싱하기 때문에 비용이 많이 듬

        ToIntFunction<Integer> number = (Integer i) -> i;

        System.out.println(number.applyAsInt(1000));
    }
}
