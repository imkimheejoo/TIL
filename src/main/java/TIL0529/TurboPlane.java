package TIL0529;

public class TurboPlane extends Plane implements Turbo {
    public static void main(String[] args) {
        TurboPlane turboPlane = new TurboPlane();
        turboPlane.boost();        // Turbo에 정의 되고 TurboPlane에 구현된 메서드 실행
        turboPlane.fly();       //Plane에 정의/구현된 메서드 실행

        //TurboPlane타입의 객체를 Plane타입이나 Turbo 타입에 할당하는 것도 가능하다.
        Plane p = turboPlane;
        p.fly();

        Turbo t = turboPlane;
        t.boost();
    }

    @Override
    public void boost() {
        System.out.println("시작");
    }
}
