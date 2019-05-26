package TIL0526;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("가나다",55),
                new Student("라마바",40),
                new Student("사아자",45)
        );

        double avg = studentList.stream()
        //중간처리(학생 객체를 나이로 매핑
                .mapToInt(Student::getAge)
                // 최종 처리(평균 나이)
                .average().getAsDouble();
        System.out.println("평균나이: "+ avg);

        studentList.stream().mapToInt(Student::getAge);
    }
}
