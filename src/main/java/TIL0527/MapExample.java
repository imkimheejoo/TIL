package TIL0527;

import TIL0526.Student;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Buddy", 10),
                new Student("Buddy2", 20),
                new Student("Buddy3", 30)
        );

        studentList.stream().mapToInt(Student::getAge).forEach(age -> System.out.println(age));
        List<Long> list = Arrays.asList((long) 1, (long) 2, (long) 3, (long) 4);
        list.stream().map(n -> n + 1).forEach(n -> System.out.println(n));
    }
}
