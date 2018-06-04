package aula07_pt1_1_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Run {

	public static void main(String[] args) {

		AbstractHelloWorld helloWorld = new PrintHelloWorld();
		helloWorld.printHelloWord();

		helloWorld = new WriteHelloWorld();
		helloWorld.printHelloWord();

	}

}