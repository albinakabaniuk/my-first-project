package lesson_41_stream_api;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Ганна", 20, 4.8),
                new Student("Андрій", 21, 3.1),
                new Student("Петро", 19, 5.0),
                new Student("Василь", 22, 3.3),
                new Student("Галина", 18, 4.5)
        );

        // Фільтруйте студентів, які мають середню оцінку (grade) менше 4.0.
        List<Student> lowGradeStudents = students.stream()
                .filter(s -> s.getGrade() < 4.0)
                .toList();

        System.out.println("Студенти з оцінкою < 4.0:");
        lowGradeStudents.forEach(System.out::println);

        // Знайдіть студента з найвищою оцінкою.
        students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .ifPresent(student ->
                        System.out.println("\nНайвища оцінка у: " + student)
                );

        // Підрахуйте кількість студентів, які старші за 20 років.
        long countOlderThan20 = students.stream()
                .filter(s -> s.getAge() > 20)
                .count();

        System.out.println("\nКількість студентів старших за 20: " + countOlderThan20);

        // Створіть список імен студентів, відсортованих за середньою оцінкою у спадному порядку.
        List<String> sortedNamesByGradeDesc = students.stream()
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .map(Student::getName)
                .toList();

        System.out.println("\nІмена за спаданням оцінки: ");
        sortedNamesByGradeDesc.forEach(System.out::println);

        // Знайдіть, чи є хоча б один студент із середньою оцінкою 5.0.
        boolean hasPerfectStudent = students.stream()
                .anyMatch(s -> s.getGrade() == 5.0);

        System.out.println("\nСтудент з оцінкою 5.0: " + hasPerfectStudent);

        // Виведіть імена студентів, які мають оцінку більше ніж 4.0.
        List<String> goodStudentsNames = students.stream()
                .filter(s -> s.getGrade() > 4.0)
                .map(Student::getName)
                .toList();

        System.out.println("\nІмена студентів з оцінкою > 4.0: ");
        goodStudentsNames.forEach(System.out::println);
    }
}
