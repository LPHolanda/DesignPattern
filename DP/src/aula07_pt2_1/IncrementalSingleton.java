package aula07_pt2_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class IncrementalSingleton {
	

	private static IncrementalSingleton instance;
	private static int count = 0;
	private int numero;
	
	private IncrementalSingleton() {
		numero = ++count;
	}
	
	public static IncrementalSingleton getInstance() {
		if(instance == null) {
			instance = new IncrementalSingleton();
		}
		return instance;
	}
	
	public String toString() {
		return "IncrementalSingleton " + numero;
}

}
