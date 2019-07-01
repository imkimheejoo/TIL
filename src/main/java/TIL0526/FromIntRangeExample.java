package TIL0526;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        System.out.println("총합: " + stream.sum());
        stream = IntStream.range(1, 100);
        System.out.println("총합:" + stream.sum());               //range는 마지막 파라미터 미만
    }
}
