package homework;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: Квадрат");
        System.out.println("Сторона: " + getWidth());
        System.out.println("Площа: " + area());
        System.out.println("Периметр: " + perimeter());
    }
}
