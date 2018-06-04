package aula08_6_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class LeitorDiario {
	
	private final MensagemDoDia mensagemDoDia;
	
	public LeitorDiario(MensagemDoDia mensagemDoDia) {
		this.mensagemDoDia = mensagemDoDia;
	}
	
	public void printMessage(String mensagem) {
		mensagemDoDia.printMessage(mensagem);
	}

}
