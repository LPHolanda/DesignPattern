package aula08_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

//TODO implementar pares de leitura e gravação para arquivos texto (BufferedReader)
//e objeto(ObjectInputStream) conforme os métodos abaixo; usar o material de pratprog como exemplo, aula 11
public class IOFacade {

	public void gravarArquivoBinario(String nome, byte[] conteudo){
		File outFile = new File(nome);
		try {
			FileOutputStream outStream = new FileOutputStream(outFile);
			outStream.write(conteudo);
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lerArquivoBinario(String nome) {
		File inFile = new File(nome);
		
		try {
			FileInputStream inStream = new FileInputStream(inFile);
			
			int tamanho = (int)inFile.length();
			byte[] conteudo = new byte[tamanho];
			
			inStream.read(conteudo);
			
			for(int i = 0; i < conteudo.length; i++) {
				System.out.println(conteudo[i]);
			}
			
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}