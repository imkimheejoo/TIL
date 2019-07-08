package TIL0708;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 함수형 인터페이스 집합들 Predicate,Consumer,Function
 */
public class Main2 {
    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(Arrays.asList("a", "b", "c", "d", "e"), nonEmptyStringPredicate);
        System.out.println(nonEmpty.toString());
        forEach(
                Arrays.asList(1, 2, 3, 4, 5),
                (Integer i) -> System.out.println(i)
        );
        //[7,2,6]
        List<Integer> l = map(
                Arrays.asList("lambdas","in","action"),(String s) -> s.length());
        System.out.println(l.toString());
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }

    /**
     * 제네릭 T를 인수로 받아서 R로 리턴하는 메서드
     * @return List<R>
     */
    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T s:list){
            result.add(f.apply(s));
        }
        return result;
    }
}

