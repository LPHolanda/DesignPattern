package aula08_4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for(int i : vetor) {
			lista.add(i);
		}
		return somaLista(lista);
	}
	

}
