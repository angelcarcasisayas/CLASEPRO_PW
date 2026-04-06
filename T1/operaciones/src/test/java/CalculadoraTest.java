import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private final Calculadora ope = new Calculadora(); // Instancia de la clase Operaciones
    @Test
    void sumar() {  // Prueba con números positivos
        int resultado = ope.Sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 + 3 debe ser 8");
        // Prueba con números negativos
        resultado = ope.Sumar(-5, -3);
        assertEquals(-8, resultado, "La suma de -5 + -3 debe ser -8");

        // Prueba con un positivo y un negativo
        resultado = ope.Sumar(5, -3);
        assertEquals(2, resultado, "La suma de 5 + -3 debe ser 2");

    }

    @Test
    void restar() {
        // Prueba con números positivos
        int resultado = ope.Restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 - 3 debe ser 2");

        // Prueba con números negativos
        resultado = ope.Restar(-5, -3);
        assertEquals(-2, resultado, "La resta de -5 - -3 debe ser -2");

        // Prueba con un positivo y un negativo
        resultado = ope.Restar(5, -3);
        assertEquals(8, resultado, "La resta de 5 - -3 debe ser 8");
    }
}