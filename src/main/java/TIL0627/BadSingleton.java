package TIL0627;

/**
 * 이렇게 하면 멀티스레드 일때 싱글톤이 아니게됨!
 */
public class BadSingleton {
    private BadSingleton uniqueSingle;

    private BadSingleton() {
        this.uniqueSingle = new BadSingleton();
    }

    public static BadSingleton getInstance(){
        return new BadSingleton();
    }


}
