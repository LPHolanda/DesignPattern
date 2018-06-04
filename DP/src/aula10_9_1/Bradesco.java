package aula10_9_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Bradesco extends BancoChain {
 
    public Bradesco() {
        super(IDBancos.Bradesco);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Bradesco");
    }
}
