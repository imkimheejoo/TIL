package TIL1105;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상으로 동작해야한다.
     * Square객체 (rectangle을 상속받은 객체)가 오면 이 가정은 깨짐 -> 다형성을 깨뜨리는 행위
     * Square 객체가 전달되먄 세로가 가로보다 커지지 않음  (둘 다 같은 값이 됨)
     * @param rectangle
     */
    public void increaseHeight(Rectangle rectangle) {
        if(rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getWidth() + 10);
        }
    }
}
