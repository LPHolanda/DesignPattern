package aula08_7_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class WriterLower extends Leitora {

	@Override
	public void transformate(String args) {
		System.out.println(args.toLowerCase());
	}

}
