package TIL0708;


import TIL0705.Apple;

import java.util.Comparator;

public class ComparatorClass {
    public static void main(String[] args) {
        //기존 코드
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.getWeight(),o2.getWeight());
            }
        };

        //람다코드
        Comparator<Apple> byWeightWithLambda =
            (Apple o1, Apple o2) -> Integer.compare(o1.getWeight(),o2.getWeight());

    }

}
