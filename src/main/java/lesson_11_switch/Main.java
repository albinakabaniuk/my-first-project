package lesson_11_switch;

public class Main {
    static void main() {

        char a = 'a';
        System.out.println(a);

        System.out.println(Character.toUpperCase(a));

        int number = 1;

        if (number == 1) {
            System.out.println("Понеділок");
        } else if (number == 2) {
            System.out.println("Вівторок");
        } else if (number == 3) {
            System.out.println("Середа");
        } else if (number == 4) {
            System.out.println("Четвер");
        } else if (number == 5) {
            System.out.println("П'ятниця");
        } else if (number == 6) {
            System.out.println("Субота");
        } else if (number == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Такого значення не існує");
        }

        switch (number) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Такого значення не існує");
        }
    }
}