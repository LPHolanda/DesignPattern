package aula07_pt1_2_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Run {

	public static void main(String[] args) {

		FabricaNome factory = new FabricaNomeEspaco();
		Nome nome = factory.fazNome("Rock Lee");
		System.out.println(nome);

		factory = new FabricaNomeVirgula();
		nome = factory.fazNome("Lee, Rock");
		System.out.println(nome);
	}

}