package TIL0627;

/**
 * 이렇게 해야 멀티스레드에서도 가능
 * 다른 방법으로는 동기화(violate,synchronize를 씀)
 * 밑에 나오는 방법은 클래스가 로딩될때 JVM에서 singleton의 유일한 인스턴스를 생성전에는
 * 어떤스레드도 정적변수에 접근이 X
 */
public class GoodSingleton {
    private static GoodSingleton unique = new GoodSingleton();

    private GoodSingleton() {
    }

    public static GoodSingleton getInstance(){
        return unique;
    }
}
