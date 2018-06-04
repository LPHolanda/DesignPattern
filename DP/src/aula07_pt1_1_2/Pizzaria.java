package aula07_pt1_1_2;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Pizzaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiasSemana factory) {
		switch (factory) {
		case DOMINGO:
			return null;
		case SEGUNDA_FEIRA:
			return new PizzaCalabresa();
		case TERCA_FEIRA:
			return new PizzaPresunto();
		case QUARTA_FEIRA:
			return new PizzaCalabresa();
		case QUINTA_FEIRA:
			return new PizzaPresunto();
		case SEXTA_FEIRA:
			return new PizzaCalabresa();
		case SABADO:
			return new PizzaPresunto();
		}
		return null;
	}

}