package TIL0529;

/**
 * EnumClass는 다른 클래스와 마찬가지로 java파일,클래스 안,클래스 밖 선언이 가능
 **/


public class Developer {
    public String name;
    public int career;
    /**
     * 클래스 내부 Enum 선언
     * public Enum DevType {
     * MOBILE ,WEB, SERVER
     * }
     **/
    public DevType type;

    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.name = "홍길동";
        developer.career = 3;
        developer.type = DevType.WEB;

        System.out.println("개발자 이름: " + developer.name);
        System.out.println("개발자 경력: " + developer.career);
        System.out.println("직무파트: " + developer.type);
    }
}
/**
 * 클래스 밖 선언
 * Enum Type {
 * MOBILE, WEB, SERVER
 * }
 **/
