package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testArea() {
        //given
        Circle circle = new Circle(5);

        //when
        double area = circle.area();

        //then
        Assertions.assertEquals(78.53981633974483, area);
    }

    @Test
    void testPerimeter() {
        // given
        Shape circle = new Circle(5);

        // when
        double perimeter = circle.perimeter();

        // then
        Assertions.assertEquals(2 * Math.PI * 5, perimeter);
    }
}