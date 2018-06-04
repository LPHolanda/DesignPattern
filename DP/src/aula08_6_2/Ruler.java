package aula08_6_2;

/**
 * @author Leandro Holanda 816113762
 */

public class Ruler {
	
	private final Ordenador ordenador;
	
	public Ruler(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	public void ordena(int[] v) {
		ordenador.ordena(v);
	}

}
