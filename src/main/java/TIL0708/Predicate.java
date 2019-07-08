package TIL0708;

//Predicate<T> 는 함수형 인터페이스
//Predicate<T>는 오작 하나의 추상 메서드만 지정한다.
// 즉 함수형 인터페이스는 오직 하나의 추상 메서드만 가지고 있는 인터페이스
// ex) Comparator,Runnable 등
public interface Predicate<T> {
    boolean test(T t);
}
