import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Clase TestBench que contiene los metodo para la ejecucion de metodos de otras clases
 * con cierta carga de trabajo y devuelve un archivo con los tiempos de ejecucion
 * 
 * @author Jonathan Arias Busto (UO283586)
 *
 */
public class TestBench {

	/**
	 * Metodo que ejecuta un metodo de otra clase con una carga n
	 * 
	 * @param className Nombre de la clase donde se encuentra el metodo a ejecutar
	 * @param methodName Metodo a ejecutar
	 * @param n Carga de la ejecucion
	 * @return Devuelve el resultado de ejecutar el metodo
	 */
	public static Object testAlgorithm(String className, String methodName, int n) {
		Object obj = null;
		try {
			obj = Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//el double.class es el tipo de carga que le pasa al metodo (en mi caso double porque trabajo con numeros mas grandes)
		Method method = null;
		try {
			method = obj.getClass().getMethod(methodName, int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// invoca al metodo con un objeto y con la carga y lo devuelve
		try {
			return method.invoke(obj, n);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Metodo que sirve para ejecutar un metodo concreto con cierta carga inicial y final,
	 * para la cual se puede repetir n veces (pasado como parametro tambien).
	 * 
	 * @param nombreFichero Nombre del fichero en el qhe se desea guardar los tiempos como resultado de ejecucion del programa
	 * @param times Veces que se ejecuta cada el metodo concreto para una carga concreta
	 * @param startN Carga incial del metodo
	 * @param endN Carga final del metodo
	 * @param className Nombre de la clase donde se encuentra el algoritmo a ejecutar
	 * @param methodName Nombre del metodo a ejecutar
	 * @throws IOException Excepcion que se lanza como resultado de un problema en la entrada/salida de un archivo
	 */
	public static void test(String nombreFichero, int times, int startN, int endN, String className, String methodName) throws IOException {
		FileWriter file = null;
		PrintWriter pw;
		
		try {
			file = new FileWriter(nombreFichero);
			pw = new PrintWriter(file);
			
			for (int workLoad = startN; workLoad<endN;workLoad++) {
				long startTime = System.currentTimeMillis();
				for (int time=0;time<times;time++) {
					testAlgorithm(className, methodName, workLoad);
				}
				long finalTime = System.currentTimeMillis();
				pw.println(workLoad + ";" + ((finalTime - startTime)/times));
				//System.out.println("Carga: " + workLoad + ", Result: " + result + ", Time: " + ((finalTime - startTime)/times));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				file.close();
			}
		}
	}
	
}
