package aula07_pt1_2_2;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Run {

	public static void main(String[] args) {
		
		FabricaProvedoraInformacao factory = new ProvedoraInformacaoPublica();
		String conteudo = factory.proverInformacao("");
		System.out.println(conteudo);
		
		conteudo = factory.proverInformacao("xesquedele");
		System.out.println(conteudo);
		
		conteudo = factory.proverInformacao(null);
		System.out.println(conteudo);
		
		factory = new ProvedoraInformacaoConfidencial();
		conteudo = factory.proverInformacao("");
		System.out.println(conteudo);
		
		conteudo = factory.proverInformacao("123");
		System.out.println(conteudo);
		
	}
	
}