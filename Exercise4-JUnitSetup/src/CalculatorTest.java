import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @Test
    public void testAdd() {

        int a = 10;
        int b = 20;

        int result = calculator.add(a, b);

        assertEquals(30, result);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }
}