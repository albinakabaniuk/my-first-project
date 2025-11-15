package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        // given
        Rectangle rectangle = new Rectangle(6, 9);

        // when
        double area = rectangle.area();

        // then
        assertEquals(54, area);
    }

    @Test
    void testPerimeter() {
        // given
        Shape rectangle = new Rectangle(3, 5);

        // when
        double perimeter = rectangle.perimeter();

        // then
        Assertions.assertEquals(2 * (3 + 5), perimeter);
    }
}