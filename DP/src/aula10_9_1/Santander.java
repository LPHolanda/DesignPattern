package aula10_9_1;

/**
 * @author Leandro Holanda 816113762
 */

public class Santander extends BancoChain {
 
    public Santander() {
        super(IDBancos.Santander);
    }
 
    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento efetuado no Santander");
    }
}