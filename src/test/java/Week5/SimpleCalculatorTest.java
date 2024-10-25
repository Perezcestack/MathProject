package Week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.addTwoNumbers(4,5);
        assertEquals(9,result);
    }

    @Test
    void addTwoNumbers_onePositive_oneNegative() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.addTwoNumbers(-10,25);
        assertEquals(15,result);
    }

    @Test
    void addTwoNumbers_dividing_byZero() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.divideTwoNumbers(1,0);
        assertEquals(Double.POSITIVE_INFINITY,result);
    }


}