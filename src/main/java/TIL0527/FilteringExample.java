package TIL0527;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","신용권","김자바","신용권","신민철");

        Stream<String> stringStream = names.stream().distinct();
        stringStream.forEach(n -> System.out.println(n));

        names.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
// 스트림은 재사용이 불가능 하다.
//        stringStream.filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
        System.out.println("------------------------------------");
        names.stream().distinct().filter(n -> n.startsWith("신")).forEach(n-> System.out.println(n));
    }
}
