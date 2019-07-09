package TIL0709;

import TIL0705.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static TIL0709.Main.filter;

public class Main2 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("red",150),new Apple("green",190));

        //Before Code
        // (Apple a)-> a.getWeight()>150가 쓰인 filter(context)를 보면 p.test(apple);(대상형식) 이렇게 쓰이는데 여기서 입력이 Apple인것을 알 수 있음
        List<Apple> heavyApples = filter(inventory,(Apple a)-> a.getWeight()>150);
        List<Apple> redApples = filter(inventory,(Apple a)-> a.getColor().equals("red"));
        Comparator<Apple> c = (Apple a1,Apple a2) -> Integer.compare(a1.getWeight(),a2.getWeight());

        //After Code
        List<Apple> heavyApples2 = filter(inventory,a-> a.getWeight()>150);
        List<Apple> redApples2 = filter(inventory,a-> a.getColor().equals("red"));
        Comparator<Apple> c2 = (a1,a2) -> Integer.compare(a1.getWeight(),a2.getWeight());

        System.out.println(heavyApples.size());
        System.out.println(heavyApples2.size());
        System.out.println(redApples.size());
        System.out.println(redApples2.size());
        System.out.println(c.compare(new Apple("red",150),new Apple("green",190)));
        System.out.println(c2.compare(new Apple("red",150),new Apple("green",190)));
    }

}
