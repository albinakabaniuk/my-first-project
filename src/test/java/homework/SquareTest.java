package homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void testArea() {

        // given
        Square square = new Square(5);

        // when
        double area = square.area();

        // then
        assertEquals(25, area);
    }

    @Test
    public void testPerimeter() {
        // given
        Shape square = new Square(9);

        // when
        double perimeter = square.perimeter();

        // then
        Assertions.assertEquals(4 * 9, perimeter);
    }
}