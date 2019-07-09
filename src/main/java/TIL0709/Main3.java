package TIL0709;

import TIL0705.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class Main3 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("red",150),new Apple("green",190));
        //Before Code
        inventory.sort((Apple a1,Apple a2) -> Integer.compare(a1.getWeight(),a2.getWeight()));

        //After Code
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //메서드 레퍼런스로 바꾸기 1
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);  //Before
        Function<String, Integer> stringToInteger2 = Integer::parseInt;  //After
        System.out.println(stringToInteger2.apply("100"));

        //메서드 레퍼런스로 바꾸기 2
        BiPredicate<List<String>,String> contains = (list, element) -> list.contains(element);  //Before
        BiPredicate<List<String>,String> contains2 = List::contains;
        System.out.println(contains2.test(Arrays.asList("red"),"red"));



    }
}
