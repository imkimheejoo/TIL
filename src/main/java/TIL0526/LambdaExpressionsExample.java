package TIL0526;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("Buddy", 24), new Student("pobi", 55));

        //forEach의 괄호안(즉 파라미터 자리) 에 Student를 가져와 람다식의 매개값을 넣음. == 요소 처리 내용(괄호 안에 있는 로직)을 매개값으로 전달
        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int age = s.getAge();
            System.out.println(name + " - " + age);
        });
    }
}
