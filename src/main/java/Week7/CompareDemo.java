package Week7;

import java.util.Comparator;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        Course num1 = new Course("Social Studies",15,20);
        Course num2 = new Course("Math 104",20,40);
        Course num3 = new Course("Philosophy",10,30);

    List<Course> courseList = List.of(num1,num2,num3);

    courseList.stream().sorted().forEach(s -> System.out.println(s.getTitle()));

    courseList.stream().sorted((course1,course2) -> course1.getMaxNumOfStudents() - course2.getMaxNumOfStudents()).forEach(s -> System.out.println(s));

    }
}
