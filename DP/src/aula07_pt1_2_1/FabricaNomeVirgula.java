package aula07_pt1_2_1;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class FabricaNomeVirgula implements FabricaNome {

	@Override
	public Nome fazNome(String nome) {
		if(nome.contains(",")) {
			String[] nomes = nome.split(",");
			Nome produtoNome = new Nome(nomes[1].trim(), nomes[0].trim());
			return produtoNome;
		}
		return null;
	}

}