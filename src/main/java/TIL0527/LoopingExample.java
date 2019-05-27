package TIL0527;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("[peek()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));  //동작 안함(peek는 중간 처리 메서드 이기 때문에 최종처리메서드가 와야 실행됨)

        System.out.println("[최종처리 메서드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총합: " + total);
        System.out.println("[forEach() 를 마지막에 호출한 경우]");

        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));   //최종 메서드로 동작함 forEach는 최종처리 메서드이므로 뒤에 또 최종처리메서드가 올 수 없다

    }
}
