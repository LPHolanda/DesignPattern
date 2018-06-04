package aula07_pt2_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class TesteIncremental {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}		
	}

}