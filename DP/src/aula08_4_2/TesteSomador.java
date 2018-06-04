package aula08_4_2;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class TesteSomador {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
