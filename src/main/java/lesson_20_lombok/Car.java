package lesson_20_lombok;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Car {

    private double fuelLevel;
    private double fuelConsumption;
    private int nextInspectionYear;

    public boolean canDrive() {
        return fuelLevel > 0;
    }

    public boolean isAllowedToDrive() {
        int currentYear = LocalDate.now().getYear();
        return currentYear <= nextInspectionYear;
    }

    public double maxDistance() {
        if (fuelConsumption <= 0) {
            return 0;
        }
        return (fuelLevel / fuelConsumption) * 100;
    }
}
