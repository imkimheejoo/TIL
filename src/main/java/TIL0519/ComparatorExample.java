package TIL0519;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(new Member("홍길동",30),new Member("Buddy",24),new Member("Noin",25));
        System.out.println(members);
        //o1이 o2보다 앞에 오게 하려면 음수를 리턴
        //o1이 o2보다 뒤에 오게하려면 양수를 리턴
        members.sort(new Comparator<Member>() {
            //오름차순정렬, 내림차순하려면 반대로 하면됨
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.getAge() < o2.getAge()) return -1;    //o2(매개변수 뒤의 값)이 더 크면 -1 -> 음수이므로 o1이 앞에옴
                if(o1.getAge() > o2.getAge()) return 1;     //o2(매개변수 뒤의 값)이 더 작으면 1 -> 양수이므로 o1이 뒤에옴
                return 0;
            }
        });
        System.out.println(members);
        members.sort(new Comparator<Member>() {
            //오름차순으로 정렬
            @Override
            public int compare(Member o1, Member o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        System.out.println(members);
        members.sort(new Comparator<Member>() {
            //내림차순으로 정렬
            @Override
            public int compare(Member o1, Member o2) {
                return Integer.compare(o2.getAge(),o1.getAge());
            }
        });
        System.out.println(members);

    }
}
