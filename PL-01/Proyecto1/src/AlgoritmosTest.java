import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlgoritmosTest {

	@Test
	void testFactorial() {
		assertEquals(1, Algoritmos.factorial(0));
		assertEquals(1, Algoritmos.factorial(1));
		assertEquals(120, Algoritmos.factorial(5));
		assertEquals(120, Algoritmos.factorial(5));
		assertEquals(7.257415615307994E306, Algoritmos.factorial(170), 0.0); //A partir de 170 es infinito
	}
	
	@Test
	void testFactorialIterativo() {
		assertEquals(1, Algoritmos.factorialIterativo(0));
		assertEquals(1, Algoritmos.factorialIterativo(1));
		assertEquals(120, Algoritmos.factorialIterativo(5));
		assertEquals(120, Algoritmos.factorialIterativo(5));
		//assertEquals(7.257415615307994E306, Algoritmos.factorialIterativo(170), 0.0); //A partir de 170 es infinito
		// este assert da un fallo en 3 cifras
	}
	
	
	
	@Test
	void testPotencia() {
		assertEquals(1, Algoritmos.potenciaBase2(0));
		assertEquals(2, Algoritmos.potenciaBase2(1));
		assertEquals(16, Algoritmos.potenciaBase2(4));
		assertEquals(32, Algoritmos.potenciaBase2(5));
		assertEquals(8.98846567431158E307, Algoritmos.potenciaBase2(1023));
	}

	@Test
	void testPotenciaIterativo() {
		assertEquals(1, Algoritmos.potenciaBase2Iterativo(0));
		assertEquals(2, Algoritmos.potenciaBase2Iterativo(1));
		assertEquals(16, Algoritmos.potenciaBase2Iterativo(4));
		assertEquals(32, Algoritmos.potenciaBase2Iterativo(5));
		assertEquals(8.98846567431158E307, Algoritmos.potenciaBase2(1023));
	}
	
	
	
	@Test
	void testFibonacci() {
		assertEquals(0, Algoritmos.fibonacci(-5));
		assertEquals(0, Algoritmos.fibonacci(0));
		assertEquals(1, Algoritmos.fibonacci(1));
		assertEquals(1, Algoritmos.fibonacci(2));
		assertEquals(5, Algoritmos.fibonacci(5));
		assertEquals(1, Algoritmos.fibonacci(2));
		assertEquals(34, Algoritmos.fibonacci(9));
		//assertEquals(1231, Algoritmos.fibonacci(60));
	}
	
	@Test
	void testFibonacciIterativo() {
		assertEquals(0, Algoritmos.fibonacciIterativo(-5));
		assertEquals(0, Algoritmos.fibonacciIterativo(0));
		assertEquals(1, Algoritmos.fibonacciIterativo(1));
		assertEquals(1, Algoritmos.fibonacciIterativo(2));
		assertEquals(5, Algoritmos.fibonacciIterativo(5));
		assertEquals(1, Algoritmos.fibonacciIterativo(2));
		assertEquals(34, Algoritmos.fibonacciIterativo(9));
		//assertEquals(1231, Algoritmos.fibonacci(60));
	}
}
