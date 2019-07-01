package TIL0529;

public class EnumExample {
    public static void main(String[] args) {
        Gender gender;
        gender = Gender.MALE;
        gender = Gender.FEMALE;

//        gender = "boy" -> //컴파일 에러
    }
}

enum Gender {
    MALE, FEMALE;
}
