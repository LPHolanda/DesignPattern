package aula10_8_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Run {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 3;
		Noticiario revistaInformatica = new Noticiario();		
		Assinante1 assinante1 = new Assinante1(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}
