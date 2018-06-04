package aula10_9_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Next extends BancoChain {
 
    public Next() {
        super(IDBancos.Next);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Next");
    }
}