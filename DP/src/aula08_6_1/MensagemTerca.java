package aula08_6_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class MensagemTerca implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("TER�A-FEIRA: " + mensagem);
	}

}
