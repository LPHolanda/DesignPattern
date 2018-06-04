package aula07_pt1_2_3;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Run {

	public static void main(String args[]) {
		FabricaLog factory = new LogConsole();
		factory.logar("console");

		factory = new LogArquivo();
		factory.logar("arquivo");
	}

}

