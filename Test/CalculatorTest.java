import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testSingletonInstance() {
        Calculator instance1 = Calculator.getInstance();
        Calculator instance2 = Calculator.getInstance();
        assertSame(instance1, instance2, "Calculator debe ser una única instancia (Singleton)");
    }

    @Test
    void testEvaluatePostfix() {
        Calculator calc = Calculator.getInstance();
        assertEquals(0, calc.evaluatePostfix(""), "evaluatePostfix debería retornar 0 para una cadena vacía");
    }

    @Test
    void testInfixToPostfix() {
        Calculator calc = Calculator.getInstance();
        assertEquals("23+", calc.infixToPostfix("2+3"), "La conversión a postfijo debería ser '23+'");
        assertEquals("23*4+", calc.infixToPostfix("2*3+4"), "La conversión debería ser '23*4+'");
        assertEquals("234*+", calc.infixToPostfix("2+3*4"), "La conversión debería ser '234*+'");
        assertEquals("23+4*", calc.infixToPostfix("(2+3)*4"), "La conversión debería ser '23+4*'");
    }
}
