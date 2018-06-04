package aula08_5;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class TesteIO {
	
	public static void main(String[] args) {
		IOFacade iof = new IOFacade();
		byte[] byteArray = {10, 20, 30, 40, 50, 60, 70, 80 };
		iof.gravarArquivoBinario("teste.bin", byteArray);
		iof.lerArquivoBinario("teste.bin");
	}
}
