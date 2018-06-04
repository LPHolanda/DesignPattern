package aula10_8_1;

/**
 * @author Leandro Holanda 816113762
 */

import java.util.Observable;

public class Noticiario extends Observable {

	private int edicao;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;

		setChanged();
		notifyObservers();
	}

	public int getEdicao() {
		return this.edicao;
	}

}