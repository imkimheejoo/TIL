package TIL0526;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나리", Member.FEMALE, 20),
                new Member("신용권", Member.MALE, 45),
                new Member("박수미", Member.FEMALE, 27)
        );

        double ageAvg = list.stream()           //오리지널 스트림
                .filter(m -> m.getSex() == Member.MALE)     //남자 Member객체를 요소로 하는 새로운 스트림을 생성
                .mapToInt(Member::getAge)   //Member객체를 age값으로 매핑해서 age를 요소로 하는 새로운 스트림을 생성
                .average()
                .getAsDouble();
        System.out.println("남성 평균나이: " + ageAvg);
    }

}
