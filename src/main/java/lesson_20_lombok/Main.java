package lesson_20_lombok;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(40, 8, 2027);

        System.out.println(car);

        System.out.println("Може їхати: " + car.canDrive());
        System.out.println("Допущена до експлуатації: " + car.isAllowedToDrive());
        System.out.println("Максимальна відстань: " + car.maxDistance() + " км");
    }
}
