package lesson_40_comparator_comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Car {
    public int yearOfManufacture;
    public double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + yearOfManufacture +
                ", engine=" + engineCapacity +
                '}';
    }

    public static void main() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2011, 2.1));
        carList.add(new Car(2005, 1.9));
        carList.add(new Car(2024, 2.6));

        carList.sort(Comparator.comparingInt(car -> car.yearOfManufacture));
        System.out.println("За роком виробництва:");
        carList.forEach(System.out::println);

        TreeSet<Car> carTreeSet = new TreeSet<>(
                Comparator.comparingDouble((Car car) -> car.engineCapacity)
                        .thenComparingInt(car -> car.yearOfManufacture));

        carTreeSet.add(new Car(2011, 1.9));
        carTreeSet.add(new Car(2005, 2.1));
        carTreeSet.add(new Car(2024, 2.6));

        System.out.println("За обсягом двигуна:");
        carTreeSet.forEach(car -> System.out.println(car.engineCapacity));
    }
}


