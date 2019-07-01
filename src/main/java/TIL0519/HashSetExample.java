package TIL0519;


import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();

        hashSet.add(new Member("홍길동", 25));
        hashSet.add(new Member("홍길동", 25));
        System.out.println(hashSet.size());
    }

}
