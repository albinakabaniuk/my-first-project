package lesson_20_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CarTest {

    @Test
    void shouldCanDrive() {
        // given
        Car car = new Car(10, 5, 2025);

        // when
        boolean result = car.canDrive();

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotCanDrive() {
        // given
        Car car = new Car(0, 5, 2025);

        // when
        boolean result = car.canDrive();

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldBeAllowedToDrive_WhenNextInspectionInFuture() {
        // given
        int nextYear = LocalDate.now().getYear() + 1;
        Car car = new Car(10, 5, nextYear);

        // when
        boolean result = car.isAllowedToDrive();

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotBeAllowedToDrive_WhenNextInspectionInPast() {
        // given
        int lastYear = LocalDate.now().getYear() - 1;
        Car car = new Car(10, 5, lastYear);

        // when
        boolean result = car.isAllowedToDrive();

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnCorrectMaxDistance_WhenFuelConsumptionPositive() {
        // given
        Car car = new Car(50, 5, 2025);

        // when
        double distance = car.maxDistance();

        // then
        Assertions.assertEquals(1000, distance);
    }

    @Test
    void shouldReturnZeroMaxDistance_WhenFuelConsumptionZero() {
        // given
        Car car = new Car(50, 0, 2025);

        // when
        double distance = car.maxDistance();

        // then
        Assertions.assertEquals(0, distance);
    }

    @Test
    void shouldReturnZeroMaxDistance_WhenFuelConsumptionNegative() {
        // given
        Car car = new Car(50, -5, 2025);

        // when
        double distance = car.maxDistance();

        // then
        Assertions.assertEquals(0, distance);
    }
}