package TIL0709;

import TIL0705.Apple;
import TIL0708.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("red",150),new Apple("green",190));
        List<Apple> heavierThan150g = filter(inventory,(Apple a)->a.getWeight() > 150); //1) filter메서드의 선언을 확인 -> 2)filter 메서드는 두 번쨰 파라미터로 Predicate<Apple> 대상형식을 기대함.

        System.out.println(heavierThan150g.get(0).getColor()+","+heavierThan150g.get(0).getWeight());
    }

    // 3)Predicate<Apple> 은 test라는 한 개의 추상메서드를 정의하는 함수형 인터페이스이다.
    // 4)test메서드는 Apple을 받아 boolean을 반환하는 함수디스크립터 존재
    //5)filter메서드로 전달된 인수는 이와 같은 요구사항을 만족해야함 -> Predicate는 Apple을 받아서 boolean을 반환해야함
    //6) 람다(p)의 시그니처 (Apple) -> boolean이므로 일치
    public static List<Apple> filter(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> havierApples = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                havierApples.add(apple);
            }
        }
        return havierApples;
    }
}
