import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testSingletonInstance() {
        Calculator instance1 = Calculator.getInstance();
        Calculator instance2 = Calculator.getInstance();
        assertSame(instance1, instance2, "La calculadora deberia ser una única instancia gracias a Singleton");
    }

    @Test
    void testEvaluatePostfix() {
        Calculator calc = Calculator.getInstance();
        assertEquals(0, calc.evaluatePostfix(""), "evaluatePostfix debería retornar 0 por ser una cadena vacía");
    }
}
