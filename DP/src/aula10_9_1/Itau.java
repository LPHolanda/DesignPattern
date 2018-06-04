package aula10_9_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Itau extends BancoChain{

	  public Itau() {
	        super(IDBancos.Itau);
	    }
	 
	    @Override
	    protected void efetuaPagamento() {
	        System.out.println("Pagamento efetuado no no Itau");
	    }

}
