package aula08_7_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Run {
	public static void main(String[] args) {
		Leitora printer = new WriterDuplicate();
		printer.transformate("teste");
		
		printer = new WriterInverse();
		printer.transformate("teste");
		
		printer = new WriterLower();
		printer.transformate("TESTE");
		
		printer = new WriterUpper();
		printer.transformate("teste");
	}
}
