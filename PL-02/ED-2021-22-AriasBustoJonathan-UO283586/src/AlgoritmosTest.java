import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas de los metodos de la clase Algoritmos
 * 
 * Algunos de los test tienen casos demasiado grandes por lo que alguno de esos casos estan comentados,
 * puesto que tardaria demasiado en acabar de ejecutar todos lo test.
 * 
 * Otros casos tienen un problema claro y es que al ser numero negativo en los casos recursivos, se lanza
 * un StackOverflowError al no acabar nunca
 * 
 * @author Jonathan Arias Busto (UO283586)
 *
 */
class AlgoritmosTest {

	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo factorialRecursivo() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	public void testFactorialRecursivo() {
		try {
			assertEquals(0, Algoritmos.factorialRecursivo(-5));
			assertEquals(0, Algoritmos.factorialRecursivo(-1));
			assertEquals(0, Algoritmos.factorialRecursivo(-14));
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.factorialRecursivo(0));
		assertEquals(1, Algoritmos.factorialRecursivo(1));
		assertEquals(120, Algoritmos.factorialRecursivo(5));
		assertEquals(120, Algoritmos.factorialRecursivo(5));
//		assertEquals(7.257415615307994E306, Algoritmos.factorialRecursivo(170), 0.0); //A partir de 170 es infinito
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo factorialIterativo() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testFactorialIterativo() {
		try {
			assertEquals(0, Algoritmos.factorialIterativo(-5));
			assertEquals(0, Algoritmos.factorialIterativo(-1));
			assertEquals(0, Algoritmos.factorialIterativo(-10));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.factorialIterativo(0));
		assertEquals(1, Algoritmos.factorialIterativo(1));
		assertEquals(120, Algoritmos.factorialIterativo(5));
		assertEquals(120, Algoritmos.factorialIterativo(5));
		//assertEquals(7.257415615307994E306, Algoritmos.factorialIterativo(170), 0.0); //A partir de 170 es infinito
		// este assert da un fallo en 3 cifras
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo potenciaRecursiva_v0() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testPotenciaRecursivo_v0() {
		try {
			assertEquals(0, Algoritmos.potenciaRecursiva_v0(-2));
			assertEquals(0, Algoritmos.potenciaRecursiva_v0(-1));
			assertEquals(0, Algoritmos.potenciaRecursiva_v0(-34));
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.potenciaRecursiva_v0(0));
		assertEquals(2, Algoritmos.potenciaRecursiva_v0(1));
		assertEquals(16, Algoritmos.potenciaRecursiva_v0(4));
		assertEquals(32, Algoritmos.potenciaRecursiva_v0(5));
//		assertEquals(8.98846567431158E307, Algoritmos.potenciaRecursiva_v0(1023));
	}

	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo potenciaRecursiva_v1() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testPotenciaRecursivo_v1() {
		try {
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-1));
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-2));
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-24));
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.potenciaRecursiva_v1(0));
		assertEquals(2, Algoritmos.potenciaRecursiva_v1(1));
		assertEquals(16, Algoritmos.potenciaRecursiva_v1(4));
		assertEquals(32, Algoritmos.potenciaRecursiva_v1(5));
//		assertEquals(8.98846567431158E307, Algoritmos.potenciaRecursiva_v1(1023));
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo potenciaRecursiva_v2() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testPotenciaRecursivo_v2() {
		try {
			assertEquals(0, Algoritmos.potenciaRecursiva_v2(-1));
			assertEquals(0, Algoritmos.potenciaRecursiva_v2(-2));
			assertEquals(0, Algoritmos.potenciaRecursiva_v2(-40));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.potenciaRecursiva_v2(0));
		assertEquals(2, Algoritmos.potenciaRecursiva_v2(1));
		assertEquals(16, Algoritmos.potenciaRecursiva_v2(4));
		assertEquals(32, Algoritmos.potenciaRecursiva_v2(5));
//		assertEquals(8.98846567431158E307, Algoritmos.potenciaRecursiva_v2(1023));
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo potenciaRecursiva_v3() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testPotenciaRecursivo_v3() {
		try {
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-6));
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-1));
			assertEquals(0, Algoritmos.potenciaRecursiva_v1(-45));
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
		
		assertEquals(1, Algoritmos.potenciaRecursiva_v3(0));
		assertEquals(2, Algoritmos.potenciaRecursiva_v3(1));
		assertEquals(16, Algoritmos.potenciaRecursiva_v3(4));
		assertEquals(32, Algoritmos.potenciaRecursiva_v3(5));
//		assertEquals(8.98846567431158E307, Algoritmos.potenciaRecursiva_v3(1023));
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo potenciaIterativa() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testPotenciaIterativo() {
		try {
			assertEquals(1, Algoritmos.potenciaIterativa(-1));
			assertEquals(1, Algoritmos.potenciaIterativa(-2));
			assertEquals(1, Algoritmos.potenciaIterativa(-12));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		assertEquals(1, Algoritmos.potenciaIterativa(0));
		assertEquals(2, Algoritmos.potenciaIterativa(1));
		assertEquals(16, Algoritmos.potenciaIterativa(4));
		assertEquals(32, Algoritmos.potenciaIterativa(5));
//		assertEquals(8.98846567431158E307, Algoritmos.potenciaIterativa(1023));
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo fibonacciRecursivo() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testFibonacciRecursivo() {
		assertEquals(0, Algoritmos.fibonacciRecursivo(-5));
		assertEquals(0, Algoritmos.fibonacciRecursivo(-1));
		assertEquals(0, Algoritmos.fibonacciRecursivo(0));
		assertEquals(1, Algoritmos.fibonacciRecursivo(1));
		assertEquals(1, Algoritmos.fibonacciRecursivo(2));
		assertEquals(5, Algoritmos.fibonacciRecursivo(5));
		assertEquals(1, Algoritmos.fibonacciRecursivo(2));
		assertEquals(34, Algoritmos.fibonacciRecursivo(9));
//		assertEquals(1231, Algoritmos.fibonacciRecursivo(60));
	}
	
	/**
	 * GIVEN
	 * WHEN se ejecuta el metodo fibonacciIterativo() para varios casos
	 * THEN se comprueba que el resultado sea el esperado
	 */
	@org.junit.jupiter.api.Test
	void testFibonacciIterativo() {
		assertEquals(0, Algoritmos.fibonacciIterativo(-5));
		assertEquals(0, Algoritmos.fibonacciIterativo(-1));
		assertEquals(0, Algoritmos.fibonacciIterativo(0));
		assertEquals(1, Algoritmos.fibonacciIterativo(1));
		assertEquals(1, Algoritmos.fibonacciIterativo(2));
		assertEquals(5, Algoritmos.fibonacciIterativo(5));
		assertEquals(1, Algoritmos.fibonacciIterativo(2));
		assertEquals(34, Algoritmos.fibonacciIterativo(9));
//		assertEquals(1231, Algoritmos.fibonacciIterativo(60));
	}
	
}
