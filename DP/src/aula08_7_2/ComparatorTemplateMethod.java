package aula08_7_2;

/**
 * @author Leandro Holanda 816113762
 */

import java.util.Comparator;

public class ComparatorTemplateMethod implements Comparator<Double> {
	
	@Override
	public int compare(Double o1, Double o2) {
		return o1.intValue() > o2.intValue() ? o1.intValue() : o2.intValue();
	}

}
