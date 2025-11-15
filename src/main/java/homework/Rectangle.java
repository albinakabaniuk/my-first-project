package homework;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void displayInfo() {
        System.out.println("Прямокутник");
        System.out.println("Ширина прямокутника: " + width);
        System.out.println("Висота прямокутника: " + height);
        System.out.println("Периметр: " + perimeter());
    }
}
