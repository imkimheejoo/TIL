package TIL0709;

import TIL0705.Apple;
import TIL0708.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * 람다가 전달될 메서드 파라미터나 람다가 할당되는 변수 등 에서 기대되는 람다 표현의 형식을 대상형식이라고 부른다.
     * @param args
     */
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("red",150),new Apple("green",170));
        List<Apple> havierThan150g = filter(inventory,(Apple a) -> a.getWeight()>150);
    }

    /**
     * Predicate<Apple>이 대상형식
     * 함수 디스크립터는 Apple(입력) -> boolean(결과)
     */
    private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> havierApples = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                havierApples.add(apple);
            }
        }
        return havierApples;
    }
}
