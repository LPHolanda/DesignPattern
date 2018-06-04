package aula10_9_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Run {
	
	public static void main(String[] args) {
	    BancoChain bancos = new Itau();
	    bancos.setNext(new Santander());
	    bancos.setNext(new Next());
	    bancos.setNext(new Bradesco());
	     
	    try {
	        bancos.efetuarPagamento(IDBancos.Bradesco);
	        bancos.efetuarPagamento(IDBancos.Itau);
	        bancos.efetuarPagamento(IDBancos.Santander);
	        bancos.efetuarPagamento(IDBancos.Next);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
