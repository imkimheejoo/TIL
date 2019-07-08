package TIL0708;

import TIL0609.HelloWorld;

public class Main {
    /**
     * 생성자 다음에 중괄호 열고 닫고가 나오면, 해당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만든다는 것을 뜻한다.
     * 괄호 안에는 메소드를 구현하거나 메소드를 추가할 수 있다. 이렇게 생성된 이름 없는 객체를 action이라는 참조변수가 참조하도록 하고, exec()메소드를 호출.
     * 익명클래스를 만드는 이유는 Action을 상속받는 클래스를 만들 필요가 없을 경우이다.
     * Action을 상속받는 클래스가 해당 클래스에서만 사용되고 다른 클래스에서는 사용되지 않는 경우이다.
     */
    public static void main(String[] args) {
        //익명 클래스 (내부 클래스)
        //Action을 상속받는 익명 클래스를 만들어서 사용
        Action action = new Action() { //Action을 상속받은 이름없는 클래스에 있는 메서드
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();

        Runnable r1 = () -> System.out.println("Hello World 1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };
        process(r1);    //외부에서 만든 람다
        process(r2);    //외부에서 만든 익명 클래스
        process(() -> System.out.println("Hello World 3")); //내부에서 만든 람다
        process(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 4");        //내부에서 만든 익명 클래스
            }
        });

    }
    public static void process(Runnable r){
        r.run();
    }
}
