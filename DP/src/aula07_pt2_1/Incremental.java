package aula07_pt2_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Incremental {
	
	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
}

}
