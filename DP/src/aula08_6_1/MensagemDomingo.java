package aula08_6_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class MensagemDomingo implements MensagemDoDia {

	@Override
	public void printMessage(String mensagem) {
		System.out.println("DOMINGO: " + mensagem);
	}

}
