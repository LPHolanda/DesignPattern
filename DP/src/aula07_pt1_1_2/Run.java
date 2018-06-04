package aula07_pt1_1_2;

/**
 * @author Leandro Holanda 816113762
 */

import static aula07_pt1_1_2.DiasSemana.DOMINGO;
import static aula07_pt1_1_2.DiasSemana.QUARTA_FEIRA;
import static aula07_pt1_1_2.DiasSemana.QUINTA_FEIRA;
import static aula07_pt1_1_2.DiasSemana.SABADO;
import static aula07_pt1_1_2.DiasSemana.SEGUNDA_FEIRA;
import static aula07_pt1_1_2.DiasSemana.SEXTA_FEIRA;
import static aula07_pt1_1_2.DiasSemana.TERCA_FEIRA;

public class Run {

	public static void main(String args[]) {
		AbstractPizzaria fabrica = new Pizzaria();

		Pizza pizza = fabrica.getFactory(DOMINGO);
		System.out.println(pizza == null ? "FECHADO" : pizza.fazer());

		pizza = fabrica.getFactory(SEGUNDA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(TERCA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(QUARTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(QUINTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(SEXTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(SABADO);
		System.out.println(pizza.fazer());

		fabrica = new Calzonaria();

		pizza = fabrica.getFactory(DOMINGO);
		System.out.println(pizza == null ? "FECHADO" : pizza.fazer());

		pizza = fabrica.getFactory(SEGUNDA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(TERCA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(QUARTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(QUINTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(SEXTA_FEIRA);
		System.out.println(pizza.fazer());

		pizza = fabrica.getFactory(SABADO);
		System.out.println(pizza.fazer());

	}

}