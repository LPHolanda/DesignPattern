package aula07_pt2_2;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class SingletonExercise {

	public static void main(String args[]) {
		Deck deck = Deck.getInstance();
		deck.print();
	}

}