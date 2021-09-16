
/**
 * Clase de algoritmos implementados de forma recursiva e iterativa
 * 
 * @author Jonathan Arias Busto (UO283586)
 *
 */
public class Algoritmos {

	/**
	 * Metodo factorial que calcula el factorial de un numero de forma recursiva
	 * 
	 * @param n Numero del cual se calcula el factorial
	 * @return Se devuelve un numero de tipo double siendo el resultado este
	 */
	public static double factorial(double n) {
		if (n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	/**
	 * Metodo factorial que calcula el factorial de un numero de forma iterativa
	 * 
	 * @param n Numero del cual se calcula el factorial
	 * @return Se devuelve un numero de tipo double siendo el resultado este
	 */
	public static double factorialIterativo(double n) {
		if (n == 0) {
			return 1;
		}
		double res = 1;
		while (n != 0) {
			res = res * n;
			n--;
		}
		return res;
	}
	
	
	
	/**
	 * Metodo que calcula la potencia en base dos de n exponente de forma recursiva
	 * 
	 * @param n Exponente de la operacion a hacer
	 * @return Devuelve el resultado de elevar a 2, n veces
	 */
	public static double potenciaBase2(double n) {
		if (n == 0) {
			return 1;
		}
		return potenciaBase2(n-1)*2;
	}
	
	/**
	 * Metodo que calcula la potencia en base dos de n exponente de forma iterativa
	 * 
	 * @param n Exponente de la operacion a hacer
	 * @return Devuelve el resultado de elevar a 2, n veces
	 */
	public static double potenciaBase2Iterativo(double n) {
		if (n == 0) {
			return 1;
		}
		double res = 1;
		for (double i=n;i>0;i--) {
			res = res * 2;
		}
		return res;
	}
	
	
	
	/**
	 * Metodo que calcula el numero n de la serie de fibonacci de forma recursiva
	 * 
	 * @param n Numero de la serie de fibonacci a calcular
	 * @return Numero n de la serie de fibonacci
	 */
	public static double fibonacci(double n) {
		if (n <= 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/**
	 * Metodo que calcula el numero n de la serie de fibonacci de forma iterativa
	 * 
	 * @param n Numero de la serie de fibonacci a calcular
	 * @return Numero n de la serie de fibonacci
	 */
	public static double fibonacciIterativo(double n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		double res = 0;
		double primero = 0;
		double segundo = 1;
		for (int i=2;i<=n;i++) {
			res = primero + segundo;
			primero = segundo;
			segundo = res;		
		}
		return res;
	}
	
}
