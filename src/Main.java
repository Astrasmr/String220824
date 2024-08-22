import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "%s %s %s".formatted(lastName, firstName, middleName);
        System.out.printf("Ф. И. О. сотрудника — %s%n%n", fullName);

        System.out.println("Задача 2");
        fullName = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s%n%n", fullName);

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s", fullName);

    }
}