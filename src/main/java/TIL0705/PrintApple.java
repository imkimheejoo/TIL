package TIL0705;

import java.util.Arrays;
import java.util.List;

/**
 * 사과 리스트를 인수로 받아 다양한 방법으로 문자열을 생성 할 수 있도록 파라미터화 된 prettyPrintApple 메서드를 구현
 */
public class PrintApple {
    public static void main(String[] args) {
        Apple apple1 = new Apple("green",150);
        Apple apple2 = new Apple("red",200);
        prettyApplePrint(Arrays.asList(apple1,apple2),new AppleWeightFormatter());
        prettyApplePrint(Arrays.asList(apple1,apple2),new AppleTotalFormatter());
    }

    public static void prettyApplePrint(List<Apple> inventory, PrintStrategy p) {
        for (Apple apple : inventory){
            String output = p.toString(apple);
            System.out.println(output);
        }
    }
}
