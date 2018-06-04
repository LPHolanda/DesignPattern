package aula08_7_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */
public class WriterInverse extends Leitora {

	@Override
	public void transformate(String args) {
		String inverse = "";
		for (int i = args.length() - 1; i >= 0; i--) {
			inverse += args.charAt(i);
		}
		System.out.println(inverse);
	}

}
